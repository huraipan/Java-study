package com.study;


class Boiler {
	
	String maker;
	int temp=0;
	
	void tempUp() {
		// �µ� ���
		temp++;
	}
	
	
	// �µ��� 20�� ��� ���� �µ��� ���
	
	void tempUp(int amount) {
		// �µ� ���
		temp+= amount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

public class OverloadingTest {

	public static void main(String[] args) {
    
		Boiler bb = new Boiler();
		System.out.println("���� �µ�: "+bb.temp);
		bb.tempUp();
		System.out.println("���� �µ�: "+bb.temp);
		bb.tempUp(20);
		System.out.println("���� �µ�: "+bb.temp);

	}

}
