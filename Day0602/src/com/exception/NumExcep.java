package com.exception;

public class NumExcep {

	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "988"};
		
		
		int i =0;
		
		
		try {
		for(i=0;i<stringNumber.length;i++) {
			int n = Integer.parseInt(stringNumber[i]);
			System.out.println("정수변환된 값은 "+n);
		}
		}catch(NumberFormatException ne) {
			System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
		}
		
		
		

	}

}
