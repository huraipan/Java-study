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
	      
	      /* select ������ ���� ��� ���հ� ������տ��� �����͸� 
	       * ������ �� �ִ� �޼ҵ带 ������ �ִ� ��ü�� ResultSet ��ü��
	       */
	      
	      try {
	         //����̹� �˻�
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url="jdbc:oracle:thin:@localhost:1521:orcl";
	         String id="scott";
	         String password="tiger";
	         
	         //DB����
	         con = DriverManager.getConnection(url, id, password);
	         
	         stmt = con.createStatement();
	         
	         /* �����ϰ��� �ϴ� sql�� select�� ���
	          * ���� ������ ��������� ���� ���� �� �ִ�
	          * executeQuery()�� ����Ѵ�.
	          * 
	          */
	         rs = stmt.executeQuery(sql.toString());
	         
	         /*
	          *  resultSet ��ü�� ���� ������ ����
	          *  resultSet�� next() �޼ҵ�� Ŀ���� �������� �̵���Ŵ
	          *  �̵��� ��ġ�� row(��)�� �����ϸ� true, �������� ������ false�� ��ȯ��
	          *  
	          *  rs.next()�� ���� ����, �� ��� ���տ� ���� �����ϴ� ���� ResultSet���κ���
	          *  �����͸� ������
	          * 
	          */
	         while(rs.next()) {
	        	 // Ŀ���� ��ġ�� row�� column���� ���� �����ϱ�
	        	 // resultSet�� getXXX(�÷��� ��ġ), getXXX("�÷� �̸�")
	        	 // �޼ҵ带 �̿��ؼ� column���� ������
	        	 int i = rs.getInt(1);// rs.getInt("deptno");
	        	 String s1 = rs.getString(2);
	        	 int j = rs.getInt("college");
	        	 String s2 = rs.getString("loc");
	        	 System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
	         }
	         
	         int result = stmt.executeUpdate(sql.toString());
	         
	         System.out.println(result+"���� ���� �����Ǿ����ϴ�");
	         
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
