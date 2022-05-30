package com.study;
/*
 *   지역변수는 초기화 과정을 거치지 않으면 사용할 수 가 없다.
 *   (자동 초기화 기능을 지원하지 않는다.)
 */

public class Class_Test001 {
	int b;

	public static void main(String[] args) {
		
		Class_Test001 ct = new Class_Test001();
		int a=0;
		System.out.println("a:"+a);
		System.out.println(ct.b);

	}

}
