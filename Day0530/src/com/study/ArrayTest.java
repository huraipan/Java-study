package com.study;
import java.util.*;
public class ArrayTest {

	public static void main(String[] args) {
		String names[] = {"홍길동", "전우치", "이도","세종대왕","이순신","강감찬","양만춘","공민왕"};
		
		
		Scanner sc = new Scanner(System.in);
		int index = -1;
		
		do {
			
			System.out.println("검색할 이름 입력:");
			String name=sc.next();
			for(int i=0;i<names.length;i++) {
				if(name.equals(names[i])) {
					index = i;
				}
			}
			
			if(index!=-1) {// 찾았다.
				System.out.println(name+"은 배열의 "+index+"인덱스 위치에서 찾았습니다.");
				break;
			}
			System.out.println("입력하신 이름은 names배열에 존재하지 않습니다.");
		}while(true);
		
		
		for(String s : names) {
			System.out.println(s);
		}
		
		
		

	}

}
