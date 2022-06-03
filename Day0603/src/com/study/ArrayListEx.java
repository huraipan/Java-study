package com.study;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("공각기동대");
		list1.add("원령공주");
		
		List<String> list2 = new ArrayList<String>(list1);
		list2.add("라퓨타");

	}

}
