package study;

import java.io.*;

public class Exam {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch;
		System.out.print("���ĺ� ���� �Է�: ");
		ch = (char) System.in.read();

		if (ch >= 'a' && ch <= 'z') {
			ch -= 32;
		} else if (ch >= 'A' && ch <= 'Z') {
			ch += 32;
		}

		System.out.println(ch);

	}

}
