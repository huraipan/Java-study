package study;

import java.io.*;
public class Exam02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n;
		char ch;
		System.out.print("알파벳 한 문자 입력: ");
		n=Integer.parseInt(br.readLine());
		
		if(n>=65&&n<=90) {
			n+=32;
			ch=(char)n;
			System.out.println(ch);
		}else if(n>=97&&n<=122) {
			n-=32;
			ch=(char)n;
			System.out.println(ch);
		}else {
			System.out.println("입력 오류");
		}
				
				
				

	}

}
