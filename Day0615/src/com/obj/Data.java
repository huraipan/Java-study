package com.obj;
/*
 *  객체의 직렬화
 *  
 *    - 특정 객체를 바이트형태로 변환하는 것을 의미함
 *    -객체의 직렬화를 통해 프로그램이 실행되는 동안 생성된 객체를 스트림을 통해서
 *     지속적으로 보관하거나 전송할 수 있음
 * 
 *     
 *     
 * 직렬화 가능한 클래스를 만드는 방법
 * 
 *    1. Serializable 인터페이스 이용
 *    
 *      ex) public calss MyObject implements Serializable{ }
 * 
 * 
 *    2. Externalizable 인터페이스를 이용
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
