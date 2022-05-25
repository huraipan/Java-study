package study;

import java.io.*;

public class Test001 {

	public static void main(String[] args) throws IOException {

		char ch; // 문자를 저장할 변수

		String s = ""; // 결과를 저장할 변수(모음이냐 자음이냐)
		System.out.print("알파벳 문자 입력: ");
		ch = (char) System.in.read();

		s = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				? (((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
						|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) ? "모음" : "자음")

				: "알파벳이 아닙니다.";

		ch += 32;

		System.out.println(ch);

	}

}
