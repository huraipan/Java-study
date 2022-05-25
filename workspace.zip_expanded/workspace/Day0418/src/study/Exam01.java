package study;

import java.io.*;
public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2;
		char op;
		
		
				
				
				
		
		System.out.print("첫번째 정수 입력: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력: ");
		op = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 정수 입력: ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d %c %d = %d", num1, op, num2, (num1+num2));
		
		
		
		
		
		
		
	}

}
