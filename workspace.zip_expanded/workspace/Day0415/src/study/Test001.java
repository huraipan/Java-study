package study;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("����: ");
		int math =Integer.parseInt(sc.next());
		System.out.print("����: ");
		int kor =Integer.parseInt(sc.next());
		System.out.print("����: ");
		int eng =Integer.parseInt(sc.next());
		
		
		int tot=math+kor+eng;
		double ave=tot/3;
		System.out.printf("����: %d\n", tot);
		System.out.printf("���: %.2f", ave);
		

	}

}
