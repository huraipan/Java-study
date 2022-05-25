package study;

import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어점수를 입력하시오: ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("수학점수를 입력하시오: ");
		int mat = Integer.parseInt(br.readLine());

		System.out.print("영어점수를 입력하시오: ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("역사점수를 입력하시오: ");
		int his = Integer.parseInt(br.readLine());

		System.out.print("과학점수를 입력하시오: ");
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
