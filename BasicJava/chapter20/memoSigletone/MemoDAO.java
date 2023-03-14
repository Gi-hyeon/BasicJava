package chapter20.memoSigletone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

// DAO: Data Access Object, 데이터베이스에 접근해서 데이터 처리 담당
public class MemoDAO {
	private static MemoDAO instance = new MemoDAO();
	
	private MemoDAO() {
		
	}
	
	public static MemoDAO getInstance() {
		return instance;
	}

	public List<MemoVO> selectMemos(String searchWord) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<MemoVO> list = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "GIHYUN";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			StringBuilder builder = new StringBuilder();
			builder.append("SELECT ");
			builder.append("    a.no, ");
			builder.append("    a.title, ");
			builder.append("    a.content, ");
			builder.append("    b.mem_name writer, ");
			builder.append("    a.register_date, ");
			builder.append("    a.modify_date ");
			builder.append("FROM ");
			builder.append("    memo a ");
			builder.append("    INNER JOIN member b ON a.writer = b.mem_id ");
			String sql = builder.toString();
			resultSet = statement.executeQuery(sql);
			list = new ArrayList<>();
			while (resultSet.next()) {
				int no = resultSet.getInt("no");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String writer = resultSet.getString("writer");
				Timestamp registerDate = resultSet.getTimestamp("register_date");
				Timestamp modifyDate = resultSet.getTimestamp("modify_date");
				list.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public MemoVO selectMemo(int searchNo) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		MemoVO memo = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "GIHYUN";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);

			StringBuilder builder = new StringBuilder();
			builder.append("SELECT ");
			builder.append("    no, ");
			builder.append("    title, ");
			builder.append("    content, ");
			builder.append("    writer ");
			builder.append("FROM ");
			builder.append("    memo ");
			builder.append("WHERE ");
			builder.append("    no = ? ");
			String sql = builder.toString();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, searchNo);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				int no = resultSet.getInt("no");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String writer = resultSet.getString("writer");
				memo = new MemoVO(no, title, content, writer);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memo;
	}

	public int insertMemo(MemoVO vo) {
		Connection connection = null;
		PreparedStatement statement = null;
		int count = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "GIHYUN";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
			StringBuilder builder = new StringBuilder();
			builder.append("INSERT INTO memo (");
			builder.append("    no,");
			builder.append("    title,");
			builder.append("    content,");
			builder.append("    writer");
			builder.append(") VALUES (");
			builder.append("    seq_memo.NEXTVAL,");
			builder.append("    ?,");
			builder.append("    ?,");
			builder.append("    ?");
			builder.append(")");
			String sql = builder.toString();
			statement = connection.prepareStatement(sql);
			statement.setString(1, vo.getTitle()); // setString이면 자동으로 작은 따옴표('')가 붙는다.
			statement.setString(2, vo.getContent()); // setInt이면 작은따옴표가 붙지 않는다.
			statement.setString(3, vo.getWriter());
			count = statement.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	
	
	
	
	
	
	
//	public int updateMemo(MemoVO vo) {
//		int count = 0;
//		PreparedStatement statement = null;
//		Connection connection = null;
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "GIHYUN";
//			String password = "java";
//			connection = DriverManager.getConnection(url, user, password);
//			StringBuilder builder = new StringBuilder();
//			builder.append("UPDATE memo ");
//			builder.append("    SET ");
//			builder.append("        title = ?, ");
//			builder.append("        CONTENT = ?, ");
//			builder.append("        writer = ?, ");
//			builder.append("        modify_date = SYSDATE ");
//			builder.append("WHERE ");
//			builder.append("    no = ? ");
//			String sql = builder.toString();
//			statement = connection.prepareStatement(sql);
//			statement.setString(1, vo.getTitle());
//			statement.setString(2, vo.getContent());
//			statement.setString(3, vo.getWriter());
//			statement.setInt(4, vo.getNo());
//			count = statement.executeUpdate();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (statement != null) {
//					statement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return count;
//	}

	public int deleteMemo(MemoVO vo) {
		int count = 0;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "GIHYUN";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
			StringBuilder builder = new StringBuilder();
			builder.append("DELETE FROM memo WHERE ");
			builder.append("    no = ? ");
			String sql = builder.toString();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, vo.getNo());
			count = statement.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public int updateMemo(MemoVO vo) {
		Connection connection = null;
		PreparedStatement statement = null;
		int count = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "GIHYUN";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
			StringBuilder builder = new StringBuilder();
			builder.append("UPDATE memo ");
			builder.append("    SET ");
			builder.append("        title = ?, ");
			builder.append("        CONTENT = ?, ");
			builder.append("        writer = ?, ");
			builder.append("        modify_date = SYSDATE ");
			builder.append("WHERE ");
			builder.append("    no = ? ");
			String sql = builder.toString();
			statement = connection.prepareStatement(sql);
			statement.setString(1, vo.getTitle());
			statement.setString(2, vo.getContent());
			statement.setString(3, vo.getWriter());
			statement.setInt(4, vo.getNo());
			count = statement.executeUpdate();
		} catch (Exception e) {
			
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	private static void dbclose() {
		
	}
}
