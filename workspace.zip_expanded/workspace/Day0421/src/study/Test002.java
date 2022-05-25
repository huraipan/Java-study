package study;

import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		System.out.println("정수 입력: ");
		a = sc.nextInt();
		
		
		if(a%2==0&&a%3==0) {
			System.out.println("2와 3의 배수");
		}else if(a%2==0) {
			System.out.println("2의 배수");
		}else if(a%3==0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("2와 3의 배수가 아님");
		}
		
		
		

	}

}
