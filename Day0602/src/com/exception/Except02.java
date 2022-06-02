package com.exception;

public class Except02 {

	public static void main(String[] args) {
		
		
		//throw new Exception();
		
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) // ah~~~~~~
				System.out.println("true");
		}catch(NullPointerException ne) {
			if(ne instanceof NullPointerException)
				System.out.println("NullPinterException");
		}finally {
				System.out.println(5);		
			
			
		}
		System.out.println(7);

	}

}
