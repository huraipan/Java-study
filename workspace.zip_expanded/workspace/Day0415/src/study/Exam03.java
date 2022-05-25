package study;

import java.util.Scanner;

public class Exam03 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int math, kor, eng, tot=0;
		double ave=0;
		
		
		System.out.print("¼öÇÐ: ");
		math =Integer.parseInt(sc.next());
		System.out.print("±¹¾î: ");
		kor =Integer.parseInt(sc.next());
		System.out.print("¿µ¾î: ");
		eng =Integer.parseInt(sc.next());
		
		ave=(math+kor+eng)/3.0;
		tot=math+kor+eng;
		
		System.out.printf("ÃÑÇÕ: %d\n", tot);
		System.out.printf("Æò±Õ: %.2f", ave);
		
		
		
		
		
		
		
		
		

	}

}
