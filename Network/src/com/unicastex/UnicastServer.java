package com.unicastex;

import java.io.*;
import java.net.*;

public class UnicastServer {
	
	//ServerSocket server = null;
	
	
	try {
	// ���� ���� ����
		server = new ServerSocket(5000);
		
		
		
		
		
	}catch(IOException ii) {
		System.out.println("�ش� ��Ʈ�� ������Դϴ�.");
		System.exit(0);
	}
	
	try {
		while(true) {
			System.out.println("Server Ready ......");
			Socket socket = server.accept();
			
			/*  Ŭ���̾�Ʈ�� �޽����� �ۼ����� �� �ִ� ������ ����
			 *  ������ ������ socket�� ���޹޾Ƽ� ������
			 *  �����带 ������
			 */
			// 
			UnicastServerThread thread = new UnicastServerThread(socket);
			
			thread.start();
			
			
			
			
			
		}
	}catch(IOException i) {
		ii.printStackTrace();
	}
	
	

	
	

	public static void main(String[] args) {
		UnicastServer uni = new UnicastServer();

	}

}
