package study;


/*  양의 실수만 입력받아 입력받은 합의 평균을 구하는 프로그램 구현
 * 단, 음의 정수가 입력되면 계속하시오
 * 
 * 양의 실수 입력: 1.1
 * 양의 실수 입력: 2.2
 * 양의 실수 입력: 3.3
 * 양의 실수 입력: 4.4
 * 양의 실수 입력 -5.5
 * 지금까지의 평균: 2.2
 * 
 */

import java.util.*;
public class ForExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float num1, num2, num3, num4, num5, ave, sum;
		 int i, n;
		 sum=0;
		 
		 
		 
		 
		 System.out.print("첫번째 실수 입력:" );
		 num1=sc.nextFloat();
		 
		 System.out.print("두번째 실수 입력:" );
		 num2=sc.nextFloat();
		 
		 System.out.print("세번째 실수 입력:" );
		 num3=sc.nextFloat();
		 
		 System.out.print("네번째 실수 입력:" );
		 num4=sc.nextFloat();
		 
		 System.out.print("다섯번째 실수 입력:" );
		 num5=sc.nextFloat();
		 
		 
		 
		 if(num1<0) {
			 num1=0;
		 }else if(num2<0) {
			 num2=0;
		 }else if(num3<0) {
			 num3=0;
		 }else if(num4<0) {
			 num4=0;
		 }else if(num5<0) {
			 num5=0;
		 }
		 
		 sum=num1+num2+num3+num4+num5;
		 
		 
		 ave=sum/5.0f;
		 
		 
		 
		 
		 System.out.println(ave);
		 
		 
		 

	}

}
