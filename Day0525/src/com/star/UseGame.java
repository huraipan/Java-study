package com.star;

public class UseGame {

	public static void main(String[] args) {
		
		Unit[] u = new Unit[3];
		
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		
		
		
		for(int i=0;i<u.length;i++) {
			System.out.println("======================================");
			// ��� ������ ���� ��ġ�� �̵����Ѷ�.
			u[i].move(100, 200);
			u[i].message();
			System.out.println("======================================");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
