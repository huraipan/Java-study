package study;

/*
 *  ������ ������ �Է� �޾� �Է¹��� ���� ¦������ �����Ͻÿ�. 
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
		
		System.out.print("ù��° ���� �Է�: ");
		a = sc.nextInt();
		
		System.out.print("������ �Է�: ");
		op=sc.next().charAt(0);
		s=sc.next();
		
		System.out.print("�ι�° ���� �Է�: ");
		b = sc.nextInt();
		
		/*if (a%2==0) {
		System.out.println("¦���Դϴ�.");
		}else {
		System.out.println("Ȧ���Դϴ�.");
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
			System.out.println("�ùٸ� �����ڰ� �ƴմϴ�.");
		}

}
}
