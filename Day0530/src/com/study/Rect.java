package com.study;
import java.util.*;

public class Rect {// �簢�� Ŭ����
	
	// �Ӽ�(�������), ���(��� �޼ҵ�)
	
	// ���� ����(����/����)
	// ��������(Ŭ��������, �ν��Ͻ�����)
	int w,h;
	
	
	// �޼ҵ� ����
	// void ��ȯ��: ��ȯ ���� ������ �ǹ���(������ ���� ����.)
	// ��ȯ: �޼ҵ� ���� �� ������� ȣ���� ������ �����ִ� ���� ��ȯ�̶���
	
	void input() {
		// �ν��Ͻ�(��ü, ��������) ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		w=sc.nextInt();
		System.out.print("���� �Է�: ");
		h=sc.nextInt();
	}
	
	
	// ���� ���
	/*
	 *  �޼ҵ� ���� �� ��� �ִ� ���(������ ����)
	 *  ���� �ڷ����� int���� �����
	 */
	
	public int area() {
		int area = w*h;
		return area;
	}
	
	
	// �ѷ� ���
	int length() {
		int length = 2*w*h;
		return length;
	}
	
	
	// ��� �޼ҵ�
	void print() { // �Ű�����:?, ���ڰ�:?
		
		/*  �Ű������� ���� �����͸� �Ѱ� ����(���� ���� ���� ������)
		 * 
		 */
		
		
		System.out.println("����: "+w);
		System.out.println("����: "+h);
		System.out.println("����: "+area());
		System.out.println("�ѷ�: "+length());
	}
	
	
	

	public static void main(String[] args) {
		Rect rc = new Rect();
		rc.input();
		rc.print();
		

	}

}
