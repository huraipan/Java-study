package com.methodex;

import java.io.*;
public class MethodEx03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int x=0;
		
		while(true) {
			System.out.print("1: �ִ�� 2: ���� �հ� 3: ���� 4: ����");
			x=Integer.parseInt(br.readLine());
			
			if(x==1) {
				int k=aaa();
				System.out.println("�� ���� �ִ밪��"+k+"�Դϴ�.");
			}else if(x==2)
			
		}

	}

}
