package com.dbex;

import java.sql.*;

/*
 *  ����Ŭ�� ���۵� SQL���� Parsing -> execute plan -> fetch�� �۾��� �� ���Ŀ�
 *  SQL���� �������� Data Buffer Cache�� ������
 *  
 *  �Ȱ��� SQL�� ���۵Ǹ� Library cache�� ����� SQL�� Parsing �����
 *  execute plan�� �״�� ����ϰ� ������ �ӵ� ��� ������ ��
 *  
 *  PreparedStatement�� SQL�� ���´� �����ϳ� �����̳� �������� �ٸ� ������
 *  ���ε� ������ ����ؼ� ����ó�������ν� �׻� ������ SQL����
 *  �����ϰ� ó���ϰ� �� �� �ִ�.
 *  
 *  -- PreparedStatement ��ü�� ������ ���ε� ������ ���
 *  
 *    ���ε� ������ ���� ������ ��ü�� �κп� �����
 *                                              deptno, dname,   college, loc
 *                                              203     ��Ǫ�Ͱ��а� 200      7ȣ��
 *    String sql = "insert into department values(?, ?, ?, ?)";
 *    PreparedStatement pstmt = con.prepareStatement(sql);
 *    ���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� ������ �ش�.
 *    pstmt.setInt(1, 203);
 *    pstmt.setString(2, "��ǻ�Ͱ��а�");
 *    pstmt.setInt(3, 200);
 *    pstmt.setString(4, "7ȣ��");
 *    
 *    �ءءءءء� ���ε� ������ ���� �÷����� ����� �� ����.
 *    
 *    PreparedStatement�� PreparedStatement�� ���ε� ������ ����
 *    �������ִ� setXXX() �޼ҵ带 �����Ѵ�.
 *    
 */

public class JdbcEx05 {

	public static void main(String[] args) {
		
		
		// PreparedStatement�� ����ϴ� ���
		// sql�������� ���� ������ ��ü�� �κ��� ?�� ó���Ѵ�.
		// ?�� DataBase���� sql����ÿ� ���� ������ ��ü��
		
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,?)");
	    
		//sql.append("insert into professor ");
		//sql.append("values(9920,'���ؿ�','haeyoungKim','���ӱ���',250,sysdate,26,203)");
	     
	   
	      Connection con = null;
	      
	      PreparedStatement pstmt = null;
	      
	      /* select ������ ���� ��� ���հ� ������տ��� �����͸� 
	       * ������ �� �ִ� �޼ҵ带 ������ �ִ� ��ü�� ResultSet ��ü��
	       */
	      
	      try {
	         
	         
	         con = CountUtil.getConnection();
	         
	         pstmt = con.prepareStatement(sql.toString());
	         // ������ �Ķ���� ����
	         // ������ ?(���ε� ����)�� ��ü�� �������� ������
	         pstmt.setInt(1, 9920);
	         pstmt.setString(2, "���ؿ�");
	         pstmt.setString(3, "haeyoungKim");
	         pstmt.setString(4, "���ӱ���");
	         pstmt.setInt(5, 250);
	         pstmt.setInt(6, 26);
	         pstmt.setInt(7, 203);
	         
	         // ���� ����
	         int i = pstmt.executeUpdate();
	         
	         System.out.println(i+"���� ���� �߰� �Ǿ����ϴ�.");
	        
	         
	         
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
