package com.study;
import java.util.*;
public class StackTest {
	
	private static final String colors[]= {
			"검정", "노랑", "녹색", "청색", "빨강", "연두색"
	};
	
	public StackTest() {
		Stack<String> st = new Stack<>();
		
		for(String color : colors) {
			st.push(color);
		}
		
//		public void popStack<Stack<String> st>{
//			System.out.println("pop: ");
//			// 스택이 비어 있지 않으면
//			// pop 해라
//			while (!st.empty()) {
//				System.out.println(st.pop());
//			
//				
//			}
//		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
