package com.dbex;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx04 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
	      
	      sql.append("select deptno, dname, college, loc ");
	      sql.append("from deparment");
	      
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	      /* select 쿼리의 수행 결과 집합과 결과집합에서 데이터를 
	       * 추출할 수 있는 메소드를 가지고 있는 객체가 ResultSet 객체임
	       */
	      
	      try {
	         //드라이버 검색
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url="jdbc:oracle:thin:@localhost:1521:orcl";
	         String id="scott";
	         String password="tiger";
	         
	         //DB연결
	         con = DriverManager.getConnection(url, id, password);
	         
	         stmt = con.createStatement();
	         
	         /* 실행하고자 하는 sql이 select인 경우
	          * 쿼리 실행의 결과집합을 리턴 받을 수 있는
	          * executeQuery()를 사용한다.
	          * 
	          */
	         rs = stmt.executeQuery(sql.toString());
	         
	         /*
	          *  resultSet 객체로 부터 데이터 추출
	          *  resultSet의 next() 메소드는 커서를 다음으로 이동시킴
	          *  이동된 위치에 row(행)가 존재하면 true, 존재하지 않으면 false를 반환함
	          *  
	          *  rs.next()가 참인 동안, 즉 결과 집합에 행이 존재하는 동안 ResultSet으로부터
	          *  데이터를 추출함
	          * 
	          */
	         while(rs.next()) {
	        	 // 커서가 위치한 row의 column에서 값을 추출하기
	        	 // resultSet의 getXXX(컬럼의 위치), getXXX("컬럼 이름")
	        	 // 메소드를 이용해서 column값을 추출함
	        	 int i = rs.getInt(1);// rs.getInt("deptno");
	        	 String s1 = rs.getString(2);
	        	 int j = rs.getInt("college");
	        	 String s2 = rs.getString("loc");
	        	 System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
	         }
	         
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
	          }try {if(rs!=null)rs.close();
	          } catch (SQLException s) {
	          }
	      }

	}

}
