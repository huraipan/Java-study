package com.threadEx;


class MyThread implements Runnable{
	


@Override
	public void run() {
	System.out.println("run");
	first();
	}

public void first() {
	System.out.println("first");
	second();
}

public void second() {
	System.out.println("second");	
}


}




public class JoinEx {

	public static void main(String[] args) {
		
		
		Runnable r = new MyThread();
		Thread mythread = new Thread(r);
		mythread.start();
		System.out.println(Thread.currentThread().getName()+" start");
		
		
		
		try {
			mythread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");

	}

}
