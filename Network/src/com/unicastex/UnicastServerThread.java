package com.unicastex;
import java.net.*;
import java.io.*;
// Ŭ���̾�Ʈ�� ����� ���ϰ�ü�� ������ ������, ������ �����ϰ� ����� ����ϴ� Ŭ������

public class UnicastServerThread extends Thread{
	
	// ������ ���� ���޵� socket�� ������
	Socket socket = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	// ��ü ������ socket�� ���� �޾Ƽ� ��� ������ ������
	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		//  ��Ʈ�� ����
		try {
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		// Ŭ���̾�Ʈ�� �޽����� �ۼ�����
		while(true) {
			// Ŭ���̾�Ʈ�� ���� �޽����� ������
			String msg = br.readLine();
			System.out.println(msg);
			
			// Ŭ���̾�Ʈ�� �޽����� ����
			bw.write(msg+"\n");
			bw.flush();
		}
		
		}catch(IOException e) {
			// Ŭ���̾�Ʈ�� ������ ������ ��� ���ܰ� �߻���
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("["+address+"]���� ������ ���������ϴ�.");
			
			
			
		}
	}

}
