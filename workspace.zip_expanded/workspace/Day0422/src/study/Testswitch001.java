package study;

//  �� ������ �����ڸ� �Է¹޾� ����ϴ� ���α׷��� ����
//  switch~case

import java.io.*;
public class Testswitch001 {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, tot;
		char op;
		
		tot=0;
				
				
				
		
		System.out.print("ù��° ���� �Է�: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�: ");
		op = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("�ι�° ���� �Է�: ");
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
			System.out.println("������ ����");
			break;
		}
		
		
		System.out.println();
		System.out.println(num1+" "+op+" "+num2+"= "+tot);
		
		
		
		
		
		
		
		
		
		
		
	}

}
