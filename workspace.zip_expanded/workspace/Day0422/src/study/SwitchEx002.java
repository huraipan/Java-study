package study;

/*
 *    ������ ���ĺ��� �Է¹޾� ������ ������ �����ϴ� ���α׷� ����
 *    �����̸� �����̶�� ���, �����̸� �����̶�� ���
 *    ��, ��ҹ��� ��� �����ϰ�, ���ĺ��̿��� ���ڰ� �ԷµǸ� �Է� ���� ó���Ͻÿ�
 * 
 */
import java.io.*;
public class SwitchEx002 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		char ch;
		
		
		
		
		
		
		
		
		System.out.print("���ĺ� �� ���� �Է�:");
		ch=(char)System.in.read();
		
		
		String st;
		
		
		
		
	        if (ch>='a'&&ch<='z'||ch>='A'&&ch<='z') {
		    st = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"����" :"����";
		    System.out.println(st);
	        }else {
	        	System.out.println("�����Է¿���");
	        }
			
			
		
		

	}

}
