package com.mapex;

/*
 *   Map<key, value>: Ű���� �ߺ��� ������� ����, ���� �ߺ��� �����
 *                    Ű���� �ߺ��� �� ��� ���� �����ؾ���
 */

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
public class HashMapEx01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//map�� ������ �߰� put(k,v);
		map.put("��ȭ", "���� ��޺� ŰŰ");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		
		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key=it.next();
			System.out.println(map.get(key));
		}
		
		map.put("��ȭ", "�޸��� ����");
		System.out.println(map);
			
		

	}

}
