package study;

/*      ����, ����, ���������� �Է¹޾� ������ ���, ������ ���ϴ� ���α׷��� �ۼ�
 *      ����: 100~90: A, ~ 60�� ���ϴ� F�� ó��
 *      ����� �Ҽ������� 2�ڸ� ���� ǥ��,
 *      ��, �� ������ ������ 0~100�� ����� ���� 
 *             
 */

import java.util.*;

public class Test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, mat, sum = 0;
		float ave = 0;
		char hak;

		do {
			System.out.print("���� ���� �Է�: ");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 100);
		do {
			System.out.print("���� ���� �Է�: ");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 100);
		do {
			System.out.print("���� ���� �Է�: ");
			mat = sc.nextInt();
		} while (mat < 0 || mat > 100);
		sum = kor + eng + mat;
		ave = sum / 3.0f;

		switch ((int) ave / 10) {
		case 10:
			hak = 'A';
			break;
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

		System.out.printf("����: %d, ���: %.2f, ����: %c", sum, ave, hak);

	}

}
