package com.classexam;

/*  �޼ҵ� �����ε�
 * 
 *  - ������(�ϳ���)Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ������ ���ǵǴ� �����ǹ���
 *  - ���� �̸��� �޼ҵ忡 ����(�Ű�����)�� �ٸ� ���
 *  - ���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, �ڷ����� �ٸ��ų�, ������ ���� �ٸ����� �ǹ���
 *  - ���� �������� ����� ������ �����ϴ� �޼ҵ� ���� ��� �̸��� ���� ����� �ϰ����� �����ϱ� ����
 *  
 *    ����������   ��ȯ��   �޼ҵ��(�ڷ��� ����, �ڷ��� ����, ...)
 *       1. ���������ڿ� ��ȯ���� ��� ����
 *       2. �޼ҵ� �̸��� �ݵ�� ���ƾ��Ѵ�(�����ؾ���)
 *       3. �ڷ���
 * 
 * 
 */
public class OverloadingEx01 {
	
	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ����: "+s.length());
	}
	
	public void floatLength(float a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ����: "+s.length());
	}

	
	public void stringLength(String str) {
		
		System.out.println("�Է��� ���� ����: "+str.length());
	}


	public static void main(String[] args) {
		
//		OverloadingEx01 oe

	}

}
