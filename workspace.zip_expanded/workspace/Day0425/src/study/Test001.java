package study;

import java.io.*;

public class Test001 {

	public static void main(String[] args) throws IOException {

		char ch; // ���ڸ� ������ ����

		String s = ""; // ����� ������ ����(�����̳� �����̳�)
		System.out.print("���ĺ� ���� �Է�: ");
		ch = (char) System.in.read();

		s = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				? (((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
						|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) ? "����" : "����")

				: "���ĺ��� �ƴմϴ�.";

		ch += 32;

		System.out.println(ch);

	}

}
