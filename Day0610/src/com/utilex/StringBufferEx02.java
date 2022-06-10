package com.utilex;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println(sb.capacity());// 16 + 10
		System.out.println(sb.length());//10
		sb.append("ABCDEFGHIJKLMNOPQ");//17
		System.out.println(sb.capacity());//54
		System.out.println(sb.length());//27
		sb.delete(1, 20);
		System.out.println(sb.capacity());//54
		System.out.println(sb.length());//8
	    	
		
    
	}

}
