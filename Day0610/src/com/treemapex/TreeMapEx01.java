package com.treemapex;

import java.util.*;
import java.io.*;

public class TreeMapEx01 {

	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("만화", "마녀배달부 키키");
		map.put("호러", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		map.put("방화", "쉬리");
		map.put("TV", "X-Files");
		
		System.out.println(map);
		
		Map<String,String> subMap = map.subMap("방화", "호러");
        System.out.println(subMap);		
        
        /*  TreeMap 클래스는 소트(정렬)된 상태로 자료가 추가된다.
         *  TreeMap 클래스의 SortedMap<K,V> subMap (K fromKey, K toKey) 메소드
         *  fromKey: 키를 포함함, toKey: 키를 포함하지 않음
         *   키 범위를 부분적으로 추출하여 리턴함
         * 
         */

	}

}
