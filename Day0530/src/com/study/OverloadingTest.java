package com.study;


class Boiler {
	
	String maker;
	int temp=0;
	
	void tempUp() {
		// 온도 상승
		temp++;
	}
	
	
	// 온도를 20도 상승 현재 온도를 출력
	
	void tempUp(int amount) {
		// 온도 상승
		temp+= amount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

public class OverloadingTest {

	public static void main(String[] args) {
    
		Boiler bb = new Boiler();
		System.out.println("현재 온도: "+bb.temp);
		bb.tempUp();
		System.out.println("현재 온도: "+bb.temp);
		bb.tempUp(20);
		System.out.println("현재 온도: "+bb.temp);

	}

}
