package study;

import java.io.*;

public class Test004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생수 입력:");
		int human = Integer.parseInt(br.readLine());

		String[] name = new String[human];

		String[][] subject = new String[human][];
		// 점수와 총점 처리 배열선언
		int[][] jumsu = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

		for (int i = 0; i < human; i++) {
			System.out.print((i + 1) + "번째 학생 이름: ");
			name[i] = br.readLine();

			System.out.print("과목수 입력: ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print((j + 1) + "번째 응시 과목: ");
				subject[i][j] = br.readLine();
			}
			jumsu[i] = new int[imsi + 1];
			System.out.println(name[i] + "학생 점수 입력: ");
			
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "점수: ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
		}

	}

}
