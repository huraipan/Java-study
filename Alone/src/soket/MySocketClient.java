package soket;
import java.io.*;
import java.net.*;
public class MySocketClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.1.176", 1234); // ���� ������ ����
			System.out.println("socket ������ ���� ����!");
			// OutStream - Ŭ���̾�Ʈ���� Server�� �޼��� �߼�
			OutputStream out = socket.getOutputStream();
			System.out.println(".");
			// socket�� OutStream ������ OutStream out�� ���� ��
			PrintWriter writer = new PrintWriter(out, true);
			// PrintWriter�� �� OutputStream�� ��� ���
			
			writer.println("CLIENT TO SERVER");
			// Ŭ���̾�Ʈ���� ������ �޼��� ������
			
			// InputStream - Server���� ���� �޼��� Ŭ���̾�Ʈ�� ������
			InputStream input = socket.getInputStream();
			// socket�� InputStream ������ InputStream in�� ���� ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			// BufferedReader�� �� InputStream�� ��� ���
			
			System.out.println(reader.readLine());
			// �������� �� �޼��� Ȯ��
			System.out.println("CLIENT SOCKET CLOSE");
			socket.close(); // ���� ����
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
