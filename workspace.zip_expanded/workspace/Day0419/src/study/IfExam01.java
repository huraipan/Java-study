package study;

/*
 *  임의의 정수를 입력 받아 입력받은 수가 짝수인지 판정하시오. 
 * 
 *  
 */

import java.util.*;
public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int a, b;
		char op;
		String s;
		
		System.out.print("첫번째 정수 입력: ");
		a = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		op=sc.next().charAt(0);
		s=sc.next();
		
		System.out.print("두번째 정수 입력: ");
		b = sc.nextInt();
		
		/*if (a%2==0) {
		System.out.println("짝수입니다.");
		}else {
		System.out.println("홀수입니다.");
		}
		
	*/
		
		
		
		if (op=='+') {
			System.out.printf("%d %c %d= %d\n", a, op, b, (a+b));
		}else if (op=='-') {
			System.out.printf("%d %c %d= %d\n", a, op, b, (a-b));
		}else if (op=='*') {
		     System.out.printf("%d %c %d= %d\n", a, op, b, (a*b));
		}else if (op=='/') {
			System.out.printf("%d %c %d= %d\n", a, op, b, (a/b));
		}else if (op=='%') {
			System.out.printf("%d %c %d= %d\n", a, op, b, (a%b));
		}else {
			System.out.println("올바른 연산자가 아닙니다.");
		}

}
}
