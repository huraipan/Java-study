package study;

import java.util.*;
public class Platicse {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		
		
		
		System.out.print("점수를 입력하시오: ");
		a = sc.nextInt();
		
		System.out.print("학년을 입력하시오: ");
		b = sc.nextInt();
		
		
		
		
		if(a>=60) {
			
			if(b!=4) {
				System.out.println("합격");
			}else if(a>=70) {
				System.out.println("합격");
			}else  {
				System.out.println("불합격");
			}
			
		}else {
			System.out.println("불합격");
		}
		
		
		
		
		
		
		
		

		
		
		
		
		
		

	}

}
