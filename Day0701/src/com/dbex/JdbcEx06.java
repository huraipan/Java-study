package com.dbex;

import java.sql.*;

public class JdbcEx06 {

	public static void main(String[] args) {
        
		StringBuffer sql = new StringBuffer();
		
		sql.append("update professor ");
		sql.append("set sal=? ");
		sql.append("where name=?");
	    
		
	   
	      Connection con = null;
	      
	      PreparedStatement pstmt = null;
	      
	      
	      
	      try {
	         
	         
	         con = CountUtil.getConnection();
	         
	         pstmt = con.prepareStatement(sql.toString());
	       
	         pstmt.setInt(1, 500);
	         pstmt.setString(2, "김해영");
	        
	         
	         
	         int i = pstmt.executeUpdate();
	         
	         System.out.println(i+"개의 행이 수정 되었습니다.");
	        
	         
	         
	      }catch(SQLException ss){
	         ss.printStackTrace();
	      } finally {
	          try {if(pstmt!=null)pstmt.close();
	         } catch (SQLException s) {
	         }
	          try {if(con!=null)con.close();
	          } catch (SQLException s) {
	          }
	      }

	}

}
