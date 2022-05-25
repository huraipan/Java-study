package com.methodex;
/*  메소드
 * 
 *   1. 메소드(멤버 함수): 객체가 할 수 있는 동작들을 정의한 것임
 *                      메소드의 종류는 두가지로 구분 짓는다.
 *                      1. 인스턴스 메소드, 2.static 메소드
 */

public class MethodEx01 {
	

	public int add(int i, int j){
		return i+j;
	}
	
	public int sub(int i, int j){
		return i-j;
	}
	
	public int multi(int i, int j){
		return i*j;
	}
	
	public int div(int i, int j){
		return i/j;
	}
	
	public static void main(String[] args) {
		
		MethodEx01 me = new MethodEx01();
	int i=10;
	int j=10;
	
	int a,b,c,d;
	a=me.add(i, j);// 덧셈하는 기능을 가진 메소드 호출
	b=me.sub(i, j);
	c=me.multi(i, j);
	d=me.div(i, j);
	
	
	System.out.println("더하기 한 결과: "+a);
	System.out.println("빼기 한 결과: "+b);
	System.out.println("곱하기 한 결과: "+c);
	System.out.println("나누기 한 결과: "+d);
	

	
	}
	public void ranking() {
		int i,j;
		
		// 모든 학생의 등수를 1로 초기화
		for(i=0;i<inwon;i++) {
			rec[i].rank=1;
			
			// 등수 계산
			//
	}
	}
}
