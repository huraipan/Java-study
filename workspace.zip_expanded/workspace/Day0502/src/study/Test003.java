package study;

/*      국어, 영어, 수학점수를 입력받아 총점과 평균, 학점을 구하는 프로그램을 작성
 *      학점: 100~90: A, ~ 60점 이하는 F로 처리
 *      평균은 소수점이하 2자리 까지 표시,
 *      단, 각 과목의 점수가 0~100을 벗어나지 못함 
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
			System.out.print("국어 점수 입력: ");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 100);
		do {
			System.out.print("영어 점수 입력: ");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 100);
		do {
			System.out.print("수학 점수 입력: ");
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

		System.out.printf("총점: %d, 평균: %.2f, 학점: %c", sum, ave, hak);

	}

}
