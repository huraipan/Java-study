package study;

/*
 *   ������ ������ ���� �ݾ��� �Է¹޾� ��������, ������, ��õ����, õ����, ���������, �������, ���ʿ�����, �ʿ�����, �Ͽ�����
 *   
 *   �Է±ݾ� : 65376
 *   5���� 1, ���� 1, õ�� 5, ��� 3, ���ʿ� 1, �ʿ�2, 1�� 6
 * 
 * 
 */

import java.util.*;
public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int a1, a2, a3, a4, a5, a6, a7;
		int b1, b2, b3, b4, b5, b6;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�: ");
		a = sc.nextInt();
		
		a1=a/50000;
		b1=a%50000;
		a2=b1/10000;
		b2=b1%10000;
		a3=b2/1000;
		b3=b2%1000;
		a4=b3/100;
		b4=b3%100;
		a5=b4/50;
		b5=b4%50;
		a6=b5/10;
		b6=b5%10;
		a7=b6/1;
		
		
		
		System.out.printf("5����: %d��\n1����: %d��\n1õ��: %d��\n1���: %d��\n50��: %d��\n10��: %d��\n1��: %d��"
				,a1,a2,a3,a4,a5,a6,a7);
		
		
		
		

	}

}
