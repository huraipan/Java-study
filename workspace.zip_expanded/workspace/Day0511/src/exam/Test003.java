package exam;
/*  ��]  
 *   Ű����� ���� �׼��� �Է¹޾� ������, ����, ��õ��, õ��, �����, ���
 *   ���ʿ�, �ʿ�, 1������ ��ȯ
 *   ��, �迭�� �ݺ����� Ȱ��   
 *   �迭��: unit
 *   65123
 */
import java.util.*;

public class Test003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 50000;
		int[] b = new int[10];
		int[] unit = new int[10];

		System.out.print("�ݾ� �Է�: ");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			b[i]=a;
			unit[i] = money / a;
			money %= a;
			if (i % 2 == 0) {
				a /= 5;
			} else
				a /= 2;			
		}

		for (int i = 0; i < unit.length; i++) {
			System.out.println(b[i]+"��: " + unit[i] + "��");
			
		}

	}

}
