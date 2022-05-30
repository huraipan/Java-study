package com.study;
import java.util.*;

public class Rect {// 사각형 클래스
	
	// 속성(멤버변수), 기능(멤버 메소드)
	
	// 변수 선언(가로/세로)
	// 전역변수(클래스변수, 인스턴스변수)
	int w,h;
	
	
	// 메소드 정의
	// void 반환형: 반환 값이 없음을 의미함(돌려줄 값이 없다.)
	// 반환: 메소드 실행 후 결과값을 호출한 곳으로 돌려주는 것을 반환이라함
	
	void input() {
		// 인스턴스(객체, 참조변수) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력: ");
		w=sc.nextInt();
		System.out.print("세로 입력: ");
		h=sc.nextInt();
	}
	
	
	// 넓이 계산
	/*
	 *  메소드 실행 후 결과 있는 경우(리턴형 지정)
	 *  리턴 자료형은 int형을 사용함
	 */
	
	public int area() {
		int area = w*h;
		return area;
	}
	
	
	// 둘레 계산
	int length() {
		int length = 2*w*h;
		return length;
	}
	
	
	// 출력 메소드
	void print() { // 매개변수:?, 인자값:?
		
		/*  매개변수를 통해 데이터를 넘겨 받음(갖고 있지 않은 데이터)
		 * 
		 */
		
		
		System.out.println("가로: "+w);
		System.out.println("가로: "+h);
		System.out.println("넓이: "+area());
		System.out.println("둘레: "+length());
	}
	
	
	

	public static void main(String[] args) {
		Rect rc = new Rect();
		rc.input();
		rc.print();
		

	}

}
