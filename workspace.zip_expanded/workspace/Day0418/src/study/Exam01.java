package study;

import java.io.*;
public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2;
		char op;
		
		
				
				
				
		
		System.out.print("ù��° ���� �Է�: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�: ");
		op = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("�ι�° ���� �Է�: ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d %c %d = %d", num1, op, num2, (num1+num2));
		
		
		
		
		
		
		
	}

}
