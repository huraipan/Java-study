package study;

import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		System.out.println("���� �Է�: ");
		a = sc.nextInt();
		
		
		if(a%2==0&&a%3==0) {
			System.out.println("2�� 3�� ���");
		}else if(a%2==0) {
			System.out.println("2�� ���");
		}else if(a%3==0) {
			System.out.println("3�� ���");
		}else {
			System.out.println("2�� 3�� ����� �ƴ�");
		}
		
		
		

	}

}
