package com.setex;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetEx {

	public static void main(String[] args) {
		// set: �ߺ��� ������, ������ ����
		Set<String> dog = new HashSet<String>();
		dog.add("������");
		dog.add("ǳ�갳");
		dog.add("����Ʈ");
		
		System.out.print("���� set ������: ");
		System.out.println(dog);
		System.out.println();
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+" ");
		}
		System.out.println();
		
		
		dog.add("������");
		System.out.print("�߰� �� set ������: ");
		System.out.println(dog);
		
		
		

	}

}
