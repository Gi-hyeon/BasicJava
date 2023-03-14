package chapter20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;

import oracle.jdbc.driver.OracleDriver;

public class JDBCProgramming2 {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "GIHYUN";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
//			String sql = "select mem_id, mem_name, mem_bir, mem_add1, mem_add2, mem_job from member";
//			String sql = "";
//			sql += "SELECT ";
//			sql += "    mem_id, ";
//			sql += "    mem_name, ";
//			sql += "    mem_bir, ";
//			sql += "    mem_add1, ";
//			sql += "    mem_add2, ";
//			sql += "    mem_job ";
//			sql += "FROM ";
//			sql += "    member ";
			
//			문자열 결합보다는 StringBlinder나 StringBuffer를 사용하는 게 좋다.
			StringBuilder builder = new StringBuilder();
//			builder.append("SELECT ").append("").append("") 도 가능하다.
			builder.append("SELECT ");
			builder.append("    mem_id, ");
			builder.append("    mem_name, ");
			builder.append("    mem_bir, ");
			builder.append("    mem_add1, ");
			builder.append("    mem_add2, ");
			builder.append("    mem_job ");
			builder.append("FROM ");
			builder.append("    member ");
			String sql = builder.toString();   //문자열로 합쳐줘야한다.
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				String memId = resultSet.getString("mem_id");
				String memName = resultSet.getString("mem_name");
				Date memBir = resultSet.getDate("mem_bir");
				String memAdd1 = resultSet.getString("mem_add1");
				String memAdd2 = resultSet.getString("mem_add2");
				String memJob = resultSet.getString("mem_job");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",memId, memName, memBir, memAdd1, memAdd2, memJob);
//				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",memId, memName, memBir.toString(), memAdd1, memAdd2, memJob);
//				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",memId, memName, memBir.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), memAdd1, memAdd2, memJob);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(connection != null) {
					connection.close();

				}
				if(statement != null) {
					statement.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}