package com.syncex;

/*  ����ȭ: �������� �����ϴ� ���� ���� �ϱ� ���ѹ��
 * 
 *    �Ӱ迵��
 *      - ��Ƽ �����忡 ���� �����ڿ��� ������ �� �ִ� �ڵ��� ������ �ǹ��Ѵ�.
 *      - ��Ƽ ������ ���α׷����� �Ӱ迵���� ó���� ��� �ɰ��� ������ �߻���
 *      - �̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ��
 *      
 *      ����ȭ�� ó���ϱ� ���� ��� ��ü�� ���� ���Խ�Ŵ
 *      
 *      ��
 *       - ������ü�� ���� �����尡 ���ÿ� �������� ���ϵ��� �ϱ� ���� ����
 *         ��� ��ü�� �� ������ ������ �� �ڵ����� ��������� ���� ���̶�� �Ѵ�.
 *         -����ȭ�� �߸��Ǹ� Dead Lock�� �ɸ�
 *         
 *         ����ȭ ���� ���
 *         1.
 *         public synchronized void synchronizeMethod() {
 *         
 *         }
 *         
 *         2.
 *         public void synchronizedMethod() {
 *         
 *         synchronized(��ü �Ǵ� Ŭ������){
 *         
 *         
 *          }
 *         }
 */



class ATM2 implements Runnable{
private long depositeMoney = 10000;
	
	@Override
	public void run() {

       synchronized (this) {
    	   
    	   for(int i=0;i<10;i++) { 
    		   if(getDepositeMoney() <= 0)break;    		   
    		     withDraw(1000);
    		     
    		     if(getDepositeMoney() == 2000||
    		    		 getDepositeMoney() == 4000||
    		    		 getDepositeMoney() == 8000) {
    		    	 try {
    	    			   this.wait();
    	    		   }catch(InterruptedException e) {
    	    			   e.printStackTrace();
    	    		   }
    		     }else {
    		    	 this.notify();
    		     }
    	   }
    	   
       }
		
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	// ���
	public void withDraw(long howMuch) {
		
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("�ܾ�: %d��\n",getDepositeMoney());
		}else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("�ܾ��� ���� �մϴ�.");
		}
	}	
	// �Ա�
}





class ATM implements Runnable{
	
	
	private long depositeMoney = 10000;
	
	@Override
	public void run() {

       synchronized (this) {
    	   
    	   for(int i=0;i<10;i++) {
    		   
    		   
    		   try {
    			   Thread.sleep(1000);
    		   }catch(InterruptedException e) {
    			   e.printStackTrace();
    		   }
    		   
    		   
    		   
    		   if(getDepositeMoney() <= 0)break;    		   
    		     withDraw(1000);
    	   }
    	   
       }
		
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	// ���
	public void withDraw(long howMuch) {
		
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.printf("�ܾ�: %d��\n",getDepositeMoney());
		}else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("�ܾ��� ���� �մϴ�.");
		}
	}	
	// �Ա�

}

public class SynchronizedEx01 {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		ATM2 atm2 = new ATM2();
		
		
		Thread t1 = new Thread(atm2, "mom");
		Thread t2 = new Thread(atm2, "son");
		
		
		t1.start();
		t2.start();
		

	}

}
