package study;

/*������ �⵵�� �Է¹޾�
�Է¹��� �⵵�� �������� ��������� �����ϴ� ���α׷� ����
if or ���׿����� Ȱ��

�������� ����
- ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
400�� ����̸� ���� �׷��� ������ ���
*/
import java.io.*;
public class Exam04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int a;
		String b;
		
		
		System.out.print("�⵵: ");
		a = Integer.parseInt(br.readLine());
		
		//b=(a%4==0&&a%100!=0||a%400==0)?"�����Դϴ�.":"����Դϴ�.";
			
		if ((a%4==0&&a%100!=0||a%400==0)) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
		}
		
		
		
		//System.out.println(b);
		
		

	}

}
