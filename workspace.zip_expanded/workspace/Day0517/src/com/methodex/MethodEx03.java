package com.methodex;

import java.io.*;
public class MethodEx03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int x=0;
		
		while(true) {
			System.out.print("1: 최대수 2: 사이 합계 3: 수열 4: 종료");
			x=Integer.parseInt(br.readLine());
			
			if(x==1) {
				int k=aaa();
				System.out.println("두 수중 최대값은"+k+"입니다.");
			}else if(x==2)
			
		}

	}

}
