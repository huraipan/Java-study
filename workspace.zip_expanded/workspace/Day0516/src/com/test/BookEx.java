package com.test;

public class BookEx {

	public static void main(String[] args) {
		
		Book mybook = new Book();
		mybook.name="논어";
		mybook.writer="공자";
		mybook.price=6000;
		mybook.isbn="100000-11111-1111";
		mybook.nowPage=1;
		
		Book mybook2= new Book("논어","공자",6000,1,"10000-11111-1111");

		
	}

}
