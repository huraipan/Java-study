package study;

import java.util.Scanner;

public class Exam03 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int math, kor, eng, tot=0;
		double ave=0;
		
		
		System.out.print("����: ");
		math =Integer.parseInt(sc.next());
		System.out.print("����: ");
		kor =Integer.parseInt(sc.next());
		System.out.print("����: ");
		eng =Integer.parseInt(sc.next());
		
		ave=(math+kor+eng)/3.0;
		tot=math+kor+eng;
		
		System.out.printf("����: %d\n", tot);
		System.out.printf("���: %.2f", ave);
		
		
		
		
		
		
		
		
		

	}

}
