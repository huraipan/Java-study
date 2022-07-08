package com.multiex;

import java.io.*;
import java.net.*;
import java.util.*;
public class MultiChatServer {
	
	private ServerSocket ss = null;
	private Socket s = null;
	
	
	// 연결된 클라이언트 스레드를 관리 ArrayList
	ArrayList<ChatThread> chatlist = new ArrayList<>();
	
	
	
	
	// 멀티 채팅 메인 프로그램
	public void start() {
		
		try {
			
			ss = new ServerSocket(4000);
			System.out.println("Server start ..............");
			
			// 무한 루프를 돌면서 클라이언트의 접속을 기다림 .......
			while(true) {
				s=ss.accept();
				
				// 연결된 클라이언트에서 스레드 생성
				ChatThread chat = new ChatThread();
				// 클라이언트 리스트에 스레드 추가
				chatlist.add(chat);
				
				// 스레드 시작
				chat.start();
				
				
				
			}
			
			
		}catch(Exception e) {
			System.out.println("[MultiChatServer]start() Exception 발생했당..........");
		}
		
		
		
	}
	
	// 각 클라이언트 관리를 위한 스레드 클래스 구현
	class ChatThread extends Thread {
		
	// 수신메시지와 파싱메시지 처리하는 변수 선언
	String msg;
	String[] rmsg;
	
	// 입출력 스트림 생성
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
	
	
	
	// 연결된 모든 클라이언트에게 메시지를 전달하는 기능 구현
	public void msgSendAll(String msg) {
		for(ChatThread ct : chatlist) {
			
		}
	}
	
	

	public static void main(String[] args) {
		
		

	}

}
