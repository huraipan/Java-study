package study;

/*
 *    ����ڷκ��� ������ ������ �Է¹޾�
 *    �Է¹��� ������ �������, ��������, 0������ �����ϴ� ���α׷��� ����
 * 
 * �Է��� ����
 * 
 *  if or ���׿����� Ȱ��
 */
import java.io.*;
public class Exam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
	int a;
	String b;
	
	
	System.out.print("���� �Է�: ");
	a = Integer.parseInt(br.readLine());
	
	/*
    if (a>0) {
    	System.out.println("����Դϴ�.");
    }else if (a<0) {
    	System.out.println("�����Դϴ�.");
    }else {
    	System.out.println("0�Դϴ�.");
    }
	*/
	
    b=(a==0) ? "0�Դϴ�." : (a>0) ? "����Դϴ�." : "�����Դϴ�.";
    System.out.println(b);
		  

		
		
		

	}

}
