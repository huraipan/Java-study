package study;

/*   ���� �ΰ��� �Է¹޾� �� �� ������ ������ �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 */
import java.io.*;
public class ForExam02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, sum, i;
		sum=0;
		
		
		
		System.out.print("ù��° ���� �Է�: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� �Է�: ");
		num2 = Integer.parseInt(br.readLine());
		
		
		
		if (num1>num2) {
			num1=num1^num2;
			num2=num2^num1;
			num1=num1^num2;
		}
		for (i=num1;i<=num2;i++) {
			sum=sum+i;
		}System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}
