package study;

/*
 *    두개의 정수와 배수 n값을 입력받아 두 수 사이의 n값을 배수의 합을 구하는 프로그램을 작성하시오. 
 * 
 */

import java.io.*;
public class ForExam03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, n, sum, i;
		sum=0;
		
		
		
		
		System.out.print("첫번째 정수 입력: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력: ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("배수 입력: ");
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
