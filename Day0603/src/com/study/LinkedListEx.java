package com.study;
import java.util.*;
public class LinkedListEx {
	
	private static final String colors1[] = 
		{"°ËÁ¤", "³ë¶û","³ì»ö","ÆÄ¶û","ÁÖÈ²","¿¬µÎ"};
	private static final String colors2[] = 
		{"ÃÊ·Ï", "»¡°­", "Èò»ö", "³²»ö", "º¸¶ó"};
	
	
	public LinkedListEx() {
		
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		for(String color : colors1) {
			list1.add(color);
		}
		
		for(String color : colors2) {
			list2.add(color);
		}
		
		list1.addAll(list2);
		
		printList(list1);
		//printList(list2);
				
	}
	
	
	
	
	public void printList(List<String> list) {
		
		for(String color : list) {
			System.out.printf("%s\t", color);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new LinkedListEx();

	}

}
