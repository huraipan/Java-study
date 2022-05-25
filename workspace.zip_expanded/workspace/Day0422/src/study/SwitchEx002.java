package study;

/*
 *    임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램 구현
 *    자음이면 자음이라고 출력, 모음이면 모음이라고 출력
 *    단, 대소문자 모두 적용하고, 알파벳이외의 문자가 입력되면 입력 오류 처리하시오
 * 
 */
import java.io.*;
public class SwitchEx002 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		char ch;
		
		
		
		
		
		
		
		
		System.out.print("알파벳 한 문자 입력:");
		ch=(char)System.in.read();
		
		
		String st;
		
		
		
		
	        if (ch>='a'&&ch<='z'||ch>='A'&&ch<='z') {
		    st = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"모음" :"자음";
		    System.out.println(st);
	        }else {
	        	System.out.println("문자입력오류");
	        }
			
			
		
		

	}

}
