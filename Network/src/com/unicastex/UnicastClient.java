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
			
			
			// ���� ����
			socket = new Socket("localhost", 5000);
			
		}catch(UnknownHostException ue) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		}catch(IOException ii) {
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
