package com.excep2;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();// ���α׷� ��ġ �غ�
			copyFiles();// ���Ϻ���

		}catch(SpaceException e) {
			System.out.println("������ �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
			System.out.println("Ȯ���� �ټ����� �ٽ� ��ġ �ٶ��ϴ�.");
		}catch(MemoryException me) {
			System.out.println("�޸𸮰� �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
		}finally {
			deleteTempFiles();
		}
		}
			
		
		
	
	static void startInstall()throws SpaceException, MemoryException{
		
		if(!enoughSpace()) {// ���α׷� ��ġ�� ������ ������ ���
			throw new SpaceException("��ġ�� ������ �ſ� �����մϴ�....");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �͹��� ���� �����մϴ�...");
		}
		
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	
	static boolean enoughMemory() {
		return true;
	}
	
	
	static void copyFiles() {// ���� ����
		
	}
	
	
	static void deleteTempFiles() {// �ӽ����� ����
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
