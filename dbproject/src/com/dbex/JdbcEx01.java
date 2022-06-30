package com.dbex;

import java.sql.*;
/*
 *   JDBC(Java DataBase Connection)를 이용한 데이터베이스 연결 방법
 *   
 *     총 6단계로 이루어진다.
 *     
 *     1단계
 *       - import java.sql.*;
 *       
 *     2단계
 *       - Driver 검색단계
 *         oracle: oracle.jdbc.driver.OracleDriver
 *         
 *     3단계
 *       - DataBase 연결
 *         Connection con = DriverManager.getConnection(url, id, password);
 *         
 *                 oracle url--> jdbc:oracle:thin@localhost:1521:SID(orcl)
 *                        id: 오라클 사용자 계정
 *                        password: 오라클 사용자 계정의 비밀번호
 *                        
 *    --------------- 무조건 해야한다. -------------------------------------
 *    
 *    4단계
 *     - 쿼리문 작성
 *     
 *     정적
 *     Statement Class(정적)
 *      - Statement stmt = con.createStatement();
 *     
 *     
 *     동적
 *     PreparedStatement (동적)
 *      - PreparedStatement pstmt = con.prepareStatement(쿼리);
 *      
 *      
 *    5단계: 쿼리 결과 저장
 *      (정적)
 *      ResultSet rs = stmt.executeQuery(query);// select
 *      ResultSet rs = stmt.executeUpdate(query);// insert, update, delete
 *      
 *      (동적)
 *      ResultSet rs = pstmt.executeQuery(query);// select
 *      ResultSet rs = pstmt.executeUpdate(query);// insert, update, delete
 *      
 *   ------------- 6단계 반드시 실행 ---------------------
 *     6단계
 *       - 사용 후 반드시 close() 메소드를 실행한다.
 *         연결 해제  
 *      
 * 
 */
public class JdbcEx01 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"SCOTT", "tiger");
			
			stmt = con.createStatement();
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into department ");
			sql.append("values(203, '제어계측공학과', 200, '7호관')");
			
			int result=stmt.executeUpdate(sql.toString());
			 System.out.println(result+"개의 행이 추가 되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {if(stmt !=null) stmt.close();}catch(SQLException s) {}
			try {if(con !=null) con.close();}catch(SQLException s) {}
		}
		
		

	}

}
