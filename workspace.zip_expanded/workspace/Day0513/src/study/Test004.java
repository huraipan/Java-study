package study;

import java.io.*;

public class Test004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�л��� �Է�:");
		int human = Integer.parseInt(br.readLine());

		String[] name = new String[human];

		String[][] subject = new String[human][];
		// ������ ���� ó�� �迭����
		int[][] jumsu = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

		for (int i = 0; i < human; i++) {
			System.out.print((i + 1) + "��° �л� �̸�: ");
			name[i] = br.readLine();

			System.out.print("����� �Է�: ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print((j + 1) + "��° ���� ����: ");
				subject[i][j] = br.readLine();
			}
			jumsu[i] = new int[imsi + 1];
			System.out.println(name[i] + "�л� ���� �Է�: ");
			
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "����: ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
		}

	}

}
