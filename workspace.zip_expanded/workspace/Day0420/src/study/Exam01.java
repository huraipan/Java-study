package study;

/*
 *5개과목의 점수를 입력받아 총점과 평균을 구하고
평균을 이용하여 학점을 판정하는 프로그램을 구하시오.
A: 90이상
B: 80이상
C: 70이상
D: 60이상
F: 60미만
 */

import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int kor, math, his, eng, sci, tot;
		double ave;
		char gpa;
		gpa=' ';
		
		
		
		System.out.print("국어 점수를 입력하시오: ");
		kor = sc.nextInt();
		
		System.out.print("수학 점수를 입력하시오: ");
		math = sc.nextInt();
		
		System.out.print("역사 점수를 입력하시오: ");
		his = sc.nextInt();
		
		System.out.print("영어 점수를 입력하시오: ");
		eng = sc.nextInt();
		
		System.out.print("과학 점수를 입력하시오: ");
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
		
		System.out.printf("총점: %d\n평균: %.2f\n학점: %c", tot, ave, gpa);
		
		
		
		
		
		
		
		
		

	}

}
