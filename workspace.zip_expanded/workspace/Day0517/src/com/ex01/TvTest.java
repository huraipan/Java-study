package com.ex01;

public class TvTest {

	public static void main(String[] args) {
		Tv t;//Tv �Κ������� �����ϱ� ���� ���� t�� �����ߴ�.
		t=new Tv();// �ν��Ͻ��� �����ߴ�.(�ν��Ͻ� = ��ü)
		t.channel=24;//Tv��ü�� �⺸���� ä�� ���� 24�� �����ߴ�. YTN
		t.channelDown();//23: ���մ���
		System.out.println("���� ä����"+t.channel+"�Դϴ�.");

	}

}
