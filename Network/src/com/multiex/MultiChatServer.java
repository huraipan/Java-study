package com.multiex;

import java.io.*;
import java.net.*;
import java.util.*;
public class MultiChatServer {
	
	private ServerSocket ss = null;
	private Socket s = null;
	
	
	// ����� Ŭ���̾�Ʈ �����带 ���� ArrayList
	ArrayList<ChatThread> chatlist = new ArrayList<>();
	
	
	
	
	// ��Ƽ ä�� ���� ���α׷�
	public void start() {
		
		try {
			
			ss = new ServerSocket(4000);
			System.out.println("Server start ..............");
			
			// ���� ������ ���鼭 Ŭ���̾�Ʈ�� ������ ��ٸ� .......
			while(true) {
				s=ss.accept();
				
				// ����� Ŭ���̾�Ʈ���� ������ ����
				ChatThread chat = new ChatThread();
				// Ŭ���̾�Ʈ ����Ʈ�� ������ �߰�
				chatlist.add(chat);
				
				// ������ ����
				chat.start();
				
				
				
			}
			
			
		}catch(Exception e) {
			System.out.println("[MultiChatServer]start() Exception �߻��ߴ�..........");
		}
		
		
		
	}
	
	// �� Ŭ���̾�Ʈ ������ ���� ������ Ŭ���� ����
	class ChatThread extends Thread {
		
	// ���Ÿ޽����� �Ľ̸޽��� ó���ϴ� ���� ����
	String msg;
	String[] rmsg;
	
	// ����� ��Ʈ�� ����
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
		
		
		
		
		
		
		
		@Override
		public void run() {
			
			try {
				
				
			}catch(IOException ii) {
				chatlist.remove(this);
			}
			
			
			
		}
	}
	
	
	
	// ����� ��� Ŭ���̾�Ʈ���� �޽����� �����ϴ� ��� ����
	public void msgSendAll(String msg) {
		for(ChatThread ct : chatlist) {
			
		}
	}
	
	

	public static void main(String[] args) {
		
		

	}

}
