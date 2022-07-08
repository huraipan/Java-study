package com.unicastex;

import java.io.*;
import java.net.*;


public class UnicastClient {
	
	Socket socket = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	BufferedReader keyboard = null;
	
	public UnicastClient() {
		
		try {
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			
			// 소켓 생성
			socket = new Socket("localhost", 5000);
			
		}catch(UnknownHostException ue) {
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		}catch(IOException ii) {
			System.out.println("서버를 연결할 수 없습니다.");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
