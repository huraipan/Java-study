package com.methodex;

public class OverloadingEx02 {
	
	public void getLength(int n) {
		String s = String.valueOf(n);
    	getLength(s);
		
	}
//    public void getLength(int n, int n1) {
//		
//	}
//    public void getLength(int n, int n1, int n2) {
//	
//}
	
    public void getLength(float n) {
    	String s = String.valueOf(n);
    	getLength(s);
		
	}

    public int getLength(String str) {
    	System.out.println("입력한 값의 길이: "+str.length());
    	return 0;
	
}

	public static void main(String[] args) {
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000);

	}

}
