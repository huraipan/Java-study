package com.test;

public class AccountEx {

	public static void main(String[] args) {
		
		// �ν��Ͻ�(��ü) ����
		Account ac = new Account();
		//ac.money=10000;
		ac.setMoney(10000, "1234");
		int myPay = ac.getMoney();
		System.out.println("���� �����ܾ�: "+myPay);

	}

}
