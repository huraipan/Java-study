package com.threadEx;

class ThreadEx03 extends Thread {
	@Override
	public void run() {
		
		for(char ch='A'; ch<='z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(150);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		
	}
}

public class ThreadExam01 {

	public static void main(String[] args) {
		ThreadEx03 t = new ThreadEx03();
		
		t.start();
		
		for(int i=1; i<60; i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		

	}

}
