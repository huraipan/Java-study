package com.study;


class House {
	int price;
	int size;
	String dong;
	String kind;
	
	
	public House() {
		this(100,32,"상계동","아파트");
	}
	
public House(int price) {
	this(100,32,"상계동","아파트");
	}

public House(int price, int size) {
	this(100,32,"상계동","아파트");
}

public House(int price, int size, String dong) {
	this(100,32,"상계동","아파트");
}

public House(int price, int size, String dong,String kind) {
	// 초기작업
	this.price=price;
	this.size=size;
	this.dong=dong;
	this.kind=kind;
	
}
















}

public class ThisConstructorExam {

	public static void main(String[] args) {
		

	}

}
