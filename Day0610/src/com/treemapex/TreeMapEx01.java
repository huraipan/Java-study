package com.treemapex;

import java.util.*;
import java.io.*;

public class TreeMapEx01 {

	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("��ȭ", "�����޺� ŰŰ");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		map.put("��ȭ", "����");
		map.put("TV", "X-Files");
		
		System.out.println(map);
		
		Map<String,String> subMap = map.subMap("��ȭ", "ȣ��");
        System.out.println(subMap);		
        
        /*  TreeMap Ŭ������ ��Ʈ(����)�� ���·� �ڷᰡ �߰��ȴ�.
         *  TreeMap Ŭ������ SortedMap<K,V> subMap (K fromKey, K toKey) �޼ҵ�
         *  fromKey: Ű�� ������, toKey: Ű�� �������� ����
         *   Ű ������ �κ������� �����Ͽ� ������
         * 
         */

	}

}
