package com.methodex;

/*
 *  ���� ���� ȣ��(call by value)
 *  �޼ҵ� ȣ��� �⺻ �ڷ����� ���� ����(�Ű�����)�� �����ϴ� ���
 */
public class ValueParameter {
	
	public int increase(int n) {
		++n;
		return n;
	}

	public static void main(String[] args) {
		
		int value=100;
		ValueParameter vp = new ValueParameter();
		int value2 = vp.increase(value);
		System.out.println("value: "+value+", value2: "+value2);
		

	}

}
