package chapter20.memo;

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
	
//	public static void main(String[] args) {
//		MemoDAO dao = new MemoDAO();
//		dao.selectMemo(""); // 메인메소드에다가 테스트한다.
//	}
	
	/*
	 * junit이라는 단위 테스트 라이브러리가 있음
	 */
	
	
	// 전체 목록 조회, 상세 메모 조회, 메모 등록, 수정, 삭제
	public List<MemoVO> selectMemos(String searchWord) throws Exception{   //try catch를 안하면 어디서 오류발생하는 지 모른다. / 단위테스트: 이 메소드가 정상적으로 돌아가는 지 확인
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DriverManager에 DB 드라이버를 등록하는 메소드를 사용할 수도 있음
//		DriverManager.registerDriver(new OracleDriver());  //오타걱정은 없지만 객체를 생성해야 한다는 단점이 있다. 잘 안씀
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  //localhost 대신 해당 IP
		String user = "GIHYUN";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");
		builder.append("    a.no, ");
		builder.append("    a.title, ");
		builder.append("    a.content, ");
		builder.append("    b.mem_name writer, ");
		builder.append("    a.register_date, ");
		builder.append("    a.modify_date ");
		builder.append("FROM ");  //공백이 있는 게 좋다. 없으면 from절이 안들어감
		builder.append("    memo a ");
		builder.append("    INNER JOIN member b ON a.writer = b.mem_id ");	
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		List<MemoVO> list = new ArrayList<>();
		while(resultSet.next()) {
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Timestamp registerDate = resultSet.getTimestamp("register_date");
			Timestamp modifyDate = resultSet.getTimestamp("modify_date");
			list.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	
	
	
	public MemoVO selectMemo(int searchNo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "GIHYUN";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
		
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
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, searchNo);
		ResultSet resultSet = statement.executeQuery();
		MemoVO memo = null;
		if(resultSet.next()) {
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			memo = new MemoVO(no, title, content, writer);
		}
		
		resultSet.close();
		statement.close();
		connection.close();
		return memo;
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "GIHYUN";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
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
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle());		//setString이면 자동으로 작은 따옴표('')가 붙는다.
		statement.setString(2, vo.getContent());	//setInt이면 작은따옴표가 붙지 않는다. 
		statement.setString(3, vo.getWriter());
		int count = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		return count;
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "GIHYUN";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
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
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContent());
		statement.setString(3, vo.getWriter());
		statement.setInt(4, vo.getNo());
		int count = statement.executeUpdate();
		statement.close();
		connection.close();
		return count;
	}
	
//	public int deleteMemo(MemoVO vo) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "GIHYUN";
//		String password = "java";
//		Connection connection = DriverManager.getConnection(url, user, password);
//		StringBuilder builder = new StringBuilder();
//		builder.append("DELETE FROM memo WHERE ");
//		builder.append("    no = ? ");
//		String sql = builder.toString();
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setInt(1, vo.getNo());
//		int count = statement.executeUpdate();
//		statement.close();
//		connection.close();
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
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
