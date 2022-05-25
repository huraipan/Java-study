package study;

import java.util.*;
public class Test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		
		
		System.out.print("첫번째 정수 입력: ");
		a = sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		b = sc.nextInt();
		
		System.out.print("세번째 정수 입력: ");
		c = sc.nextInt();
		
		
		
		if (a>b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}if (a>c) {
			a = a ^c;
			c = c ^ a;
			a = a ^ c;
		}if (b > c) {
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		
		
		System.out.printf("%d %d %d", a, b, c);
		
		
		
		
		

	}

}
