package com.ex03;

public class CircleEX {

	public static void main(String[] args) {
		
		
		Circle pizza;// ���۷��� ��������
		
		pizza = new Circle();// ��ü ����
		
		
		pizza.radius=10;// ������ �������� 10���� ����
		pizza.name="�ڹ�����";
		
		// ����ũ�� ���ϱ�(����)
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������"+area);
		
		Circle donut = new Circle();
		donut.radius=2;// ������ �������� 2�� ����
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
		
		
		
		
		
		

	}

}
