package com.star;

public class Tank extends Unit{
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Move it! Move it! siegeTank ==> x:"+x+", y: "+y);
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 대기 상태에 있습니다.");
	}
	
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Go, Siege!!!");
	}
	
	void changeMode() {
		System.out.println("Yes, Sir!!!");
	}
	
	
	

}
