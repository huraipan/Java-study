package study;

/*     �Էµ� ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�.
 *      1. ���� ���� �Է��� ������ ������ ����ڷ� ���� �Է� �޴´�.
 *      2. �Է¹��� �� ��ŭ ��հ��� ���Ͽ� ����Ѵ�.
 *      �� ��հ��� �Ǽ��� ó���Ѵ�.
 */

import java.util.*;
public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, i, n;
		double avg, sum=0.0;
		
		System.out.print("�Է��� ������ ����: ");
		n=sc.nextInt();
		
		
		for(i=1;i<=n;i++) {
			System.out.print("���� �Է�: ");
			a=sc.nextInt();
			sum+=a;
		}
		
		avg=sum/n;
		System.out.printf("%.2f",avg);
		
		

	}

}
