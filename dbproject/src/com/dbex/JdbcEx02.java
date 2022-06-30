package com.dbex;

import java.sql.*;
public class JdbcEx02 {// update: 학과명: 컴퓨터 공학과 변경 조건 학과번호 = 203

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
	      
	      sql.append("update department set dname='컴퓨터공학과' ");
	      sql.append("where deptno=203");
	      
	      Connection con = null;
	      Statement stmt = null;
	      
	      try {
	         //드라이버 검색
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url="jdbc:oracle:thin:@localhost:1521:orcl";
	         String id="scott";
	         String password="tiger";
	         
	         //DB연결
	         con = DriverManager.getConnection(url, id, password);
	         
	         stmt = con.createStatement();
	         
	         int result = stmt.executeUpdate(sql.toString());
	         
	         System.out.println(result+"개의 행이 수정되었습니다");
	         
	      } catch (ClassNotFoundException cnfe) {
	         cnfe.printStackTrace();
	      } catch(SQLException ss){
	         ss.printStackTrace();
	      } finally {
	          try {if(stmt!=null)stmt.close();
	         } catch (SQLException s) {
	         }
	          try {if(con!=null)con.close();
	          } catch (SQLException s) {
	          }
	      }

		

	}

}
