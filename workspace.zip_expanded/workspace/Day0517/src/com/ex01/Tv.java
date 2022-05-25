package com.ex01;

public class Tv {

	// 클래스의 구성요소(속성+메소드)
	// 속성(멤버 변수, 필드)
	String color;
	boolean power;
	int channel;
	
	
	// Tv의 기능(메소드)
	public void power() {
		power = !power;//처리
		// 결과를 리턴함
		//return power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
