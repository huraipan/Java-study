package com.test;


class Car {
	
	String color;
	int speed;
	
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed=speed-value;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
	
	
	
	
	
}

public class Test001 {
	
	int a;//Ŭ��������//��ü�� �����ؾ߸��Ѵ�.
	static int b;//��ü�� �������� �ʾƵ� ���ٰ���

	public static void main(String[] args) {
	
		
		
		
		
		
		Car car1 = new Car();
		car1.color="�����";//carŬ���� ��������� ���� �����Ѵ�.
		car1.speed=0;
		//car Ŭ������ upSpeed(30)�޼ҵ忡 30�� ���.
		car1.upSpeed(30);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getSpeed());
		

	}

}
