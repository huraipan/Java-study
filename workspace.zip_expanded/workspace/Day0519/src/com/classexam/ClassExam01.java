package com.classexam;

import java.io.IOException;

public class ClassExam01 {

	public static void main(String[] args)throws IOException {
		
		ClassExam ce = new ClassExam();
		// �� �Է�
		ce.setX();
		ce.setY();
		
		// ��� ���
		ce.diplay();
		
		// ��ǥ �̵�
		ce.setX(50);
		ce.setY(80);
		
		ce.diplay();

	}

}
