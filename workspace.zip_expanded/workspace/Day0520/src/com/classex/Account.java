package com.classex;

public class Account {
	
	private String name;// ������
	private long balance;// �ܰ�
	
	
	public Account() {}
	
	public Account(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public long getBlalance() {
		return balance;
	}
	
	
	// �Ա�
	public void deposit(long amount) {
		balance += amount;
	}
	
	// ���
	public void withdraw(long amount) {
		if(balance < amount) {
		System.out.println("�ܾ��� �����մϴ�.");	
		}else{
			balance -= amount;
		}
		
	}
	
	
	
	
	

}
