package com.dbex;

import java.sql.*;


/*  Transaction
 * 
 *   - Ʈ������� �������� �۾��� �ϳ��� ������ �۾� ������ �����ִ� ���� ����
 *     �ϳ��� �۾��������� ��ü �۾����� ��� �ùٸ��� ����ǰų�, �Ǵ� ��ü �۾���
 *     ��� ������� �ʵ��� �Ѵ�.
 *   
 *    �޼ҵ� ����
 *    
 *     commit(), rollback(), rollback(SavePoint), 
 *     setSavepoint(String name), setAutoCommit(boolean value)
 * 
 */
class JdbcEx08 {

	public static void main(String[] args) {
		
/*  Transaction: ������ �۾�����
 *  insert, delete, update���� �۾����� �ϳ��� ������ �۾������� ���
 *  ���� ����� ��� �۾��� ����ó�� �� ��쿡�� commit�� �����ؼ� db�� �ݿ��ϰ�,
 *  ���� ���� �� �ϳ��� ����ó������ ���� ��� rollback�� �����ؼ�
 *  �۾��������� ��� �۾��� ����Ѵ�.
 */
		
		
		
		
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname=?, loc=? ");
		sql2.append("where deptno=?");
		
	   
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      
	      
	      
	      try {
	         
	         
	         con = CountUtil.getConnection();
	         // autoCommit ��� ��Ȱ��ȭ ��Ŵ
	         con.setAutoCommit(false);
	         
	         //-------------- ù ��° �۾� ���� -------------------
	         
	         
	         pstmt = con.prepareStatement(sql1.toString());
//	         pstmt.setInt(1, 255);
//	         pstmt.setString(2, "�ٹ����а�");
//	         pstmt.setInt(3, 200);
//	         pstmt.setString(4, "9ȣ��");
//	         pstmt.executeUpdate();
	         
	         
	         
	         
	         pstmt = con.prepareStatement(sql2.toString());
	         pstmt.setString(1, "������а�");
	         pstmt.setString(2, "8ȣ��");
	         pstmt.setInt(3, 255);
	         pstmt.executeUpdate();
	         
	         
	         
	         con.commit();
	         System.out.println("db�� ���������� �ݿ��Ǿ����ϴ�.");
	         
	         
	        
	         
	         
	      }catch(SQLException ss){
	         // ������ ���������� ������� ���� ���
	    	  try {
	    		  con.rollback();
	 	         System.out.println("db�� �۾��� ��� �Ǿ����ϴ�.");
	    	  }catch(SQLException s) {
	    		  s.printStackTrace();
	    	  }
	    	  
	    	  
	      } finally {
	          try {if(pstmt!=null)pstmt.close();
	         } catch (SQLException s) {
	        	 s.printStackTrace();
	         }
	          try {if(con!=null)con.close();
	          } catch (SQLException s) {
	        	  s.printStackTrace();
	          }
	          
	          
	          
	          
	      }
		
		
		

	}

}
