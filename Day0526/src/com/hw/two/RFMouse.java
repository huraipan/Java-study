package com.hw.two;

public class RFMouse extends Mouse implements IRF {
	
	
	

	@Override
	public void wconnect() { // �������̽��� �޼ҵ� ������
		// TODO Auto-generated method stub
		System.out.println("���콺 ���� �����");

	}

	@Override
	public void wdisconnect() {// �������̽��� �޼ҵ� ������
		// TODO Auto-generated method stub
		System.out.println("���콺 ���� ���� ����");

	}

	public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		System.out.println("�������: "+IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();

	}

	@Override
	void move() {// �߻� Ŭ������ �޼ҵ带 ������
		// TODO Auto-generated method stub
		System.out.println("���콺 ������");
		
	}

	@Override
	void scroll() {// �߻� Ŭ������ �޼ҵ带 ������
		// TODO Auto-generated method stub
		System.out.println("���콺 ��ũ�� ����");
		
	}

}
