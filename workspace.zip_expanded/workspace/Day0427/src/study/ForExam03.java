package study;

/*
 *    �ΰ��� ������ ��� n���� �Է¹޾� �� �� ������ n���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 
 */

import java.io.*;
public class ForExam03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, n, sum, i;
		sum=0;
		
		
		
		
		System.out.print("ù��° ���� �Է�: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� �Է�: ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("��� �Է�: ");
		n = Integer.parseInt(br.readLine());
		
		
		if (num1>num2) {
			num1=num1^num2;
			num2=num2^num1;
			num1=num1^num2;
		}
		
		for(i=num1;i<=num2;i++) {
			if(i%n==0) {
				sum=sum+i;
			}else {
				continue;
			}
				
		}
		
		System.out.println(sum);
		
		// n>=num1, n<=num2,
			
		
		
		

	}

}
