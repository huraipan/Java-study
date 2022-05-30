package soket;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class MySocketServer {

	public static void main(String[] args) {
		try {
			int socketPort = 1234;
			ServerSocket serverSocket = new ServerSocket(socketPort);// ���� �����
			Socket socketUser = null; // Ŭ���̾�Ʈ ���ӽ� ����� Socket
			System.out.println("socket: "+ socketPort + "���� ������ ���Ƚ��ϴ�");
			
			// ���� ������ ����� ������ �ݺ�
			while(true) {
				
				socketUser = serverSocket.accept();
				// ���� ������ ���� �� socketUser�� ������ ���� �Ҵ�
				System.out.println("Client�� ������: "+socketUser.getLocalAddress());
				// �������� getLocalAddress ��������
				
				// InputStream - Ŭ���̾�Ʈ���� ������
				InputStream input = socketUser.getInputStream();
				// socket�� InputStream ������ InputStream in�� ���� ��
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				// BufferedReader�� �� InputStream�� ��� ���
				
				System.out.println(reader.readLine());
				// Ŭ���̾�Ʈ���� �� �޼��� Ȯ��
				
				// OutputStream - �������� Ŭ���̾�Ʈ��
				OutputStream out = socketUser.getOutputStream();
				// socket�� OutputStream ������ OutputStream out�� ���� ��
				PrintWriter writer = new PrintWriter(out, true);
				//BufferedReader�� �� InputStream�� ��� ���
				
				writer.println("SERVER TO CLIENT");
				// �������� Ŭ���̾�Ʈ�� �޼��� ������
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
