package com.dbex;

import java.sql.*;

public class JdbcEx07 {

	public static void main(String[] args) {
StringBuffer sql = new StringBuffer();
		
		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno=?");
	    
		
	   
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      
	      try {
	         
	         
	         con = CountUtil.getConnection();
	         
	         pstmt = con.prepareStatement(sql.toString());
	       
	         pstmt.setInt(1, 203);
	        
	        
	         
	         // 쿼리 실행
	         rs = pstmt.executeQuery();
	         // 결과 집합에서 값 추출하기
	         while(rs.next()) {
	        	 System.out.println(rs.getString("name")+"\t");
	        	 System.out.println(rs.getInt("profno")+"\t");
	        	 System.out.println(rs.getString("dname")+"\t");
	        	 System.out.println(rs.getString("position")+"\t");
	        	 
	        	 
	         }
	         
	         
	        
	         
	         
	      }catch(SQLException ss){
	         ss.printStackTrace();
	      } finally {
	          try {if(pstmt!=null)pstmt.close();
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
