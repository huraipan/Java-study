package study;

import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���������� �Է��Ͻÿ�: ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("���������� �Է��Ͻÿ�: ");
		int mat = Integer.parseInt(br.readLine());

		System.out.print("���������� �Է��Ͻÿ�: ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("���������� �Է��Ͻÿ�: ");
		int his = Integer.parseInt(br.readLine());

		System.out.print("���������� �Է��Ͻÿ�: ");
		int sci = Integer.parseInt(br.readLine());

		int tot = kor + mat + eng + his + sci;
		int avg = tot / 5;
		char hak;

		switch (avg / 10) {
		case 9:
			hak = 'A';
			break;
		case 8:
			hak = 'B';
			break;
		case 7:
			hak = 'C';
			break;
		case 6:
			hak = 'D';
			break;

		default:
			hak = 'F';

		}

		System.out.println(hak);
		
	}

}
