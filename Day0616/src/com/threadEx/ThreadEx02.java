package com.threadEx;

public class ThreadEx02 implements Runnable{

private int[] tmp;
	
	public ThreadEx02() {
		tmp = new int[10];
		for(int start = 0; start < tmp.length; ++start) {
			tmp[start] = start;
		}
	}
	
	
	
	
	@Override
	public void run() {
		for(int start : tmp) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름: %s, ", Thread.currentThread().getName());
			System.out.printf("temp value: %d\n",start);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ThreadEx02 te = new ThreadEx02();
		Thread t = new Thread(te,"박진우");
		t.start();

	}

	

}
