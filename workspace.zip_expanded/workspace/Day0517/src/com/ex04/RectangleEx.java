package com.ex04;

import java.util.*;
public class RectangleEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rectangle rect=new Rectangle();
		
		System.out.print("����: ");
		rect.width=sc.nextInt();
		System.out.print("����: ");
		rect.height=sc.nextInt();
		
		System.out.println("�簢���� ���̴�"+rect.getArea()+"�Դϴ�.");
		
		

	}

}
