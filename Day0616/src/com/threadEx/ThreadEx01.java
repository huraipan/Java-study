package com.threadEx;
import java.io.*;
public class ThreadEx01 extends Thread{
	
	private int[] tmp;
	
	public ThreadEx01(String threadname) {
		super(threadname);
		tmp = new int[10];
		for(int start = 0; start < tmp.length; ++start) {
			tmp[start] = start;
		}
	}
	
	@Override
	public void run() {
		for(int start : tmp) {
			try {
				sleep(1000);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름: %s, ", currentThread().getName());
			System.out.printf("temp value: %d\n",start);
		}
		
	}

	
	
	public static void main(String[] args) {
		ThreadEx01 te = new ThreadEx01("김해영");
		te.start();
		
		
	}
	
	
}


