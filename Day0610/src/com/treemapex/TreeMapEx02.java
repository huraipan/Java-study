package com.treemapex;
import java.util.*;
public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<String,SungRec> map = new TreeMap<String,SungRec>();
		map.put("3333", new SungRec("김말자", 80, 80, 70));
		map.put("2222", new SungRec("이순신", 100, 100, 100));
		map.put("1111", new SungRec("홍길동", 90, 80, 80));
		map.put("4444", new SungRec("강감찬", 90, 90, 90));
		map.put("5555", new SungRec("김유신", 70, 80, 70));
		
		
		String key;
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			SungRec data = map.get(key);
			System.out.printf("%7s%10s%5d%5d%5d%5d\n",
					key, data.getName(),data.getKor(),data.getEng(),data.getMat(),data.getTot());
		}

	}

}
	