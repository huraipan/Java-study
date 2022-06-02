package com.exception;
import java.sql.*;
public class SQLEx {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
					"scott","tiger");
		}catch(ClassNotFoundException ce) {
			System.out.println("����̹��� �����ϴ�.");
		}catch(SQLException se) {
			System.out.println("�����ͺ��̽� �������...");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {if(stmt != null)stmt.close();}catch(SQLException se) {}
			try {if(con != null)con.close();}catch(SQLException se) {}
		}

	}

}
