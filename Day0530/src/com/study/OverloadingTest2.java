package com.study;

public class OverloadingTest2 {
	
	public int area(int w, int h) {
		return w*h;
	}
	
	public double area(int r) {
		return r*r*3.141592;
	}
	
	public void write(int result) {
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ: "+result);
	}
	
	public void write(double result) {
		System.out.println("¿ø ³ĞÀÌ: "+result);
	}
	
	

	

	

	public static void main(String[] args) {
		OverloadingTest2 ot = new OverloadingTest2();
		int res = ot.area(10, 5);
		double cc = ot.area(10);
		
		
		ot.write(res);
		ot.write(cc);

	}

}
