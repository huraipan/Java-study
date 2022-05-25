package study;

import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		
		
		
		System.out.print("점수를 입력하시오: ");
		a = sc.nextInt();
		
		System.out.print("학년을 입력하시오: ");
		b = sc.nextInt();
		
		
	
		
		if (a>69&&a<101&&b==4) {
			System.out.print("합격입니다.");
		}else if (a<70&&a>=0&&b==4){
			System.out.println("불합격입니다.");
		}else if(a>59&&a<101&&b<4&&b>0) {
			System.out.println("합격입니다.");
		}else if(a<60&&a>=0&&b<4&&b>0) {
			System.out.println("불합격입니다.");
		}else if(a>100||a<0) {
			System.out.println("잘못된 점수입니다.");
		}else if(b<1||b>4) {
			System.out.println("잘못된 학년입니다.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
