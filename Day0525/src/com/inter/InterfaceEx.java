package com.inter;

public class InterfaceEx implements InterEx {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		System.out.println("getA(): "+ie.getA());

	}

}
