package com.inner;

public class OuterEx01 {// ¿ÜºÎ
	
	public static class InnerEx01{
		
		static int x = 10;
		
	}

	public static void main(String[] args) {
		OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();
		
		
		System.out.println("oi: "+oi.x);
		System.out.println("oi: "+OuterEx01.InnerEx01.x);

	}

}
