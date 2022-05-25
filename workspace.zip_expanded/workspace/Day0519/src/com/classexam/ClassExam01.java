package com.classexam;

import java.io.IOException;

public class ClassExam01 {

	public static void main(String[] args)throws IOException {
		
		ClassExam ce = new ClassExam();
		// 값 입력
		ce.setX();
		ce.setY();
		
		// 결과 출력
		ce.diplay();
		
		// 좌표 이동
		ce.setX(50);
		ce.setY(80);
		
		ce.diplay();

	}

}
