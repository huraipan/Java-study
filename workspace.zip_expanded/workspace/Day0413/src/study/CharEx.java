package study;


/*
 *   char: 2byte
 *   
 *   - �ƽ�Ű �ڵ�: 1����Ʈ ���ڸ� ǥ��, 0 ~ 255 ���� ����
 *   - �����ڵ�: 2����Ʈ�� ǥ��(0 ~ 65535 ���� ����)���� ǥ��
 *   
 *  
 * 
 */


import java.util.*;


public class CharEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		char ch1='A';
		char ch2='\u0041';
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		System.out.println((char)(ch1+ch2));
		
		
		System.out.print("���� �Է�");
		String str = sc.next();
		System.out.println(str);

	}

}
