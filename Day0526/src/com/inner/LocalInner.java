package com.inner;

/*
 *  LocalInner class
 *  
 *  - Ŭ���� ���ο� Ư�� �޼ҵ� �ȿ� ���ǵǴ� Ŭ������.
 *  - ���������� ���� ���̴�.
 *    �޼ҵ尡 ȣ��� �� ������ �� ������ �޼ҵ��� ������� �������� ������
 *    ���������� ���� �ڵ����� �Ҹ��
 *    
 *    �� ��������� �ʴ´�.
 *      - �޼ҵ� ���ο� Ŭ������ ���� �޼ҵ� ����ÿ��� �����
 *      
 *      class Outer {
 *      
 *       public void aa() {// Ŭ������ ��� �޼ҵ�
 *         class Inner {// �޼ҵ� �ȿ� ���������� ���� ���� ��ġ
 *         
 *         }
 *        }
 *        
 *      }   
 * 
 * 
 * 
 * 
 */

public class LocalInner {
	
	int a = 100;// �ܺ�Ŭ������ ��� ����
	
	public void innerExam01(int k) {// ��� �޼ҵ�
		
		int b =200;// ��������(�޼ҵ� �������� ������)
		final int c=k;// ���
		
		class Inner {//���� �̳� Ŭ����
			//���� �̳� Ŭ������ �ܺ� Ŭ������ ��� ������ ���� ��ġ�� ������
			//��� ������ ����鸸 ������ �����ϴ�.
			public void getData() {
				
				System.out.println("int a: "+a);
				System.out.println("int b: "+b);
				System.out.println("final int c: "+c);
			}
		}// end inner class
		
		// �޼ҵ� ������ ���� �̳� Ŭ������ ��ü ������ �����ϴ�.
		Inner i =new Inner();
	}

	public static void main(String[] args) {
		LocalInner li = new LocalInner();
		li.innerExam01(1000);

	}

}
