package com.test;

public class Book {// 클래스 헤더(클래스 명)
	
	//멤버필드(변수, 상수), 속성
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자
	public Book(String name, String writer, int price, int nowPage, String isbn) {
	  this.name = name;
	  this.writer = writer;
	  this.price=price;
	  this.nowPage=nowPage;
	  this.isbn=isbn;
	}
	
	//메소드(동작, 행위)
	public void nextPage() {nowPage++;}
	public void previousPage() {nowPage--;}
	
	
	

}
