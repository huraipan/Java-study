package study;

/*
 *5�������� ������ �Է¹޾� ������ ����� ���ϰ�
����� �̿��Ͽ� ������ �����ϴ� ���α׷��� ���Ͻÿ�.
A: 90�̻�
B: 80�̻�
C: 70�̻�
D: 60�̻�
F: 60�̸�
 */

import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int kor, math, his, eng, sci, tot;
		double ave;
		char gpa;
		gpa=' ';
		
		
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		kor = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		math = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		his = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		eng = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		sci = sc.nextInt();
		
		
		tot=kor+math+his+eng+sci;
		ave=tot/5.0;
		
		
		
		if (ave>=90) {
			gpa='A';
		}else if (ave>=80) {
			gpa='B';
		}else if (ave>=70) {
			gpa='C';
		}else if (ave>=60) {
			gpa='D';
		}else {
			gpa='F';
		}
		
		System.out.printf("����: %d\n���: %.2f\n����: %c", tot, ave, gpa);
		
		
		
		
		
		
		
		
		

	}

}
