package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception {
		
//		JDBC(Java DataBase Connectivity)
//		Database vendor -> Oracle driver(각 드라이버마다 벤더가 존재한다.)
//		준비물 : DBMS 전용 드라이버(oracle driver) jdbc.jar -> ojdbc.jar sqlserver_jdbc.jar
//		방법
//		1. 드라이버 로딩(Reflection 기법 사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		2. 접속 정보를 이용하여 DBMS에 접속(Connection)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GIHYUN", "java");
		
//		3. 쿼리를 전송할 객체(Statement) 생성     //연결하면 워크시트 생김
		Statement statement = connection.createStatement();
		
//		4. 쿼리를 실행 또는 전송     //워크시트 실행
		String sql = "select mem_id, mem_name, mem_hp, mem_mail from member";  //세미콜론 붙이면 안됌 ;
		
//		5. select: executeQuery => 쿼리 결과를 객체(ResultSet)로 전달 받음 
//		   executeQuery 메소드는 데이터베이스에서 데이터를 가져와서 결과 집합을 반환 / Select문에서만 실행한다는 특징을 가짐.
		
//	  	   insert, update, delete: executeUpdate => 실행 완료된 row 카운트 결과 전송
//		   executeUpdate 메소드의 반환 값은 해당 SQL 문 실행에 영향을 받는 행 수를 반환.
		
		ResultSet resultSet = statement.executeQuery(sql);
//		sql에서 커서가 MEM_ID, 1 사이에 있고 다음으로 넘어가면서 데이터 가져오라는 뜻
		while(resultSet.next()) {
			String memId = resultSet.getString("mem_id");  //인덱스를 적어도 괜찮으나 컬럼명을 많이 쓴다.
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s\t%s\t%s\t%s\n", memId, memName, memHp, memMail);
		}
		
//		6. 자원(Resource: Connection, Statement, ResultSet) 반납     //SQL DEVELOPER 종료
		resultSet.close();
		statement.close();
		connection.close();
	}
}
