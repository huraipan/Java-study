package study;

import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		
		
		
		System.out.print("������ �Է��Ͻÿ�: ");
		a = sc.nextInt();
		
		System.out.print("�г��� �Է��Ͻÿ�: ");
		b = sc.nextInt();
		
		
	
		
		if (a>69&&a<101&&b==4) {
			System.out.print("�հ��Դϴ�.");
		}else if (a<70&&a>=0&&b==4){
			System.out.println("���հ��Դϴ�.");
		}else if(a>59&&a<101&&b<4&&b>0) {
			System.out.println("�հ��Դϴ�.");
		}else if(a<60&&a>=0&&b<4&&b>0) {
			System.out.println("���հ��Դϴ�.");
		}else if(a>100||a<0) {
			System.out.println("�߸��� �����Դϴ�.");
		}else if(b<1||b>4) {
			System.out.println("�߸��� �г��Դϴ�.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
