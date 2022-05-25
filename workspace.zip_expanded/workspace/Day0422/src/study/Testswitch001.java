package study;

//  두 정수와 연산자를 입력받아 계산하는 프로그램을 구현
//  switch~case

import java.io.*;
public class Testswitch001 {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, tot;
		char op;
		
		tot=0;
				
				
				
		
		System.out.print("첫번째 정수 입력: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력: ");
		op = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 정수 입력: ");
		num2 = Integer.parseInt(br.readLine());
		
		
		
		switch (op) {
		case '+':
			tot=num1+num2;
			break;
        case '-':
			tot=num1-num2;
			break;
        case '/':
			tot=num1/num2;
			break;
        case '%':
	        tot=num1%num2;
	         break;
        case '*':
			tot=num1*num2;
			break;

		default:
			System.out.println("연산자 오류");
			break;
		}
		
		
		System.out.println();
		System.out.println(num1+" "+op+" "+num2+"= "+tot);
		
		
		
		
		
		
		
		
		
		
		
	}

}
