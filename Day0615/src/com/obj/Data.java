package com.obj;
/*
 *  ��ü�� ����ȭ
 *  
 *    - Ư�� ��ü�� ����Ʈ���·� ��ȯ�ϴ� ���� �ǹ���
 *    -��ü�� ����ȭ�� ���� ���α׷��� ����Ǵ� ���� ������ ��ü�� ��Ʈ���� ���ؼ�
 *     ���������� �����ϰų� ������ �� ����
 * 
 *     
 *     
 * ����ȭ ������ Ŭ������ ����� ���
 * 
 *    1. Serializable �������̽� �̿�
 *    
 *      ex) public calss MyObject implements Serializable{ }
 * 
 * 
 *    2. Externalizable �������̽��� �̿�
 *    
 *      ex) public class MyObject implements Externalizable{
 *      @Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
 * 
 * 
 * 
 * 
 */

import java.io.*;


    











public class Data implements Serializable {

	
	private int no;
	private String name;
	private String mail;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	
	
	
	
	

}
