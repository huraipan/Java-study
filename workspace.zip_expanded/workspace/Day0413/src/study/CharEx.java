package study;


/*
 *   char: 2byte
 *   
 *   - 아스키 코드: 1바이트 문자를 표현, 0 ~ 255 문자 범위
 *   - 유니코드: 2바이트를 표현(0 ~ 65535 문자 범위)까지 표현
 *   
 *  
 * 
 */


import java.util.*;


public class CharEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		char ch1='A';
		char ch2='\u0041';
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		System.out.println((char)(ch1+ch2));
		
		
		System.out.print("문자 입력");
		String str = sc.next();
		System.out.println(str);

	}

}
