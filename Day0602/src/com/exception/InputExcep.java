package com.exception;
import java.util.*;
public class InputExcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���.");
		
		int sum=0,n=0;
		
		
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"��° ����: ");
			try {
				n=sc.nextInt();	
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ̽��ϴ�. ������ �Է��ϼ���.");
				//���� �Է½�Ʈ���� �����ִ� ��ū�� �����.
				sc.nextLine();
				i--;//�ε����� �������� �ʵ��� �̸� ���ҽ�Ŵ
				continue;
				
			}
			
			
			sum+=n;
			
		}
		System.out.println("���� 3���� �հ�: "+sum);

	}

}
