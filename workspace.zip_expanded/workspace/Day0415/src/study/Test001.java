package study;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("¼öÇÐ: ");
		int math =Integer.parseInt(sc.next());
		System.out.print("±¹¾î: ");
		int kor =Integer.parseInt(sc.next());
		System.out.print("¿µ¾î: ");
		int eng =Integer.parseInt(sc.next());
		
		
		int tot=math+kor+eng;
		double ave=tot/3;
		System.out.printf("ÃÑÇÕ: %d\n", tot);
		System.out.printf("Æò±Õ: %.2f", ave);
		

	}

}
