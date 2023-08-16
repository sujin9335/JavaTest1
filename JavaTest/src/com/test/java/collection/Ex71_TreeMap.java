package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {

	public static void main(String[] args) {
		
		//TreeMap
		//- Tree > 이전 탐색 트리 > 자동 정렬
		//- Map > 키+값 > 연관 배열
		
		TreeMap<String,String> map=new TreeMap<String,String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		
		System.out.println(map.size());
		
		System.out.println(map);
		
		System.out.println(map.get("green"));
		
		map.put("green", "녹색");
		
		System.out.println(map.get("green"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m")); //m보다 앞에 시작
		System.out.println(map.tailMap("m")); //m보다 뒤에 시작
		System.out.println(map.subMap("r","y"));
		
		
		Vector<Integer> list=new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0));
		
		
		
		
		/*
		
			list
			- ArrayList > 배열이 필요할 때 / 삽입, 삭제(x) ****
			- LinkedList > ArrayList 대체제 / 삽입, 삭제(o)
			- Stack > 스택 구조 필요
			- Queue > 큐 구조 필요
			- Vector -(ArrayList 가 대체 되서 안함)
			
			Set
			- HashSet > 중복값 배제, 유일한 집합 ****
			- TreeSet > HashSet + 정렬
		
			Map
			- HashMap > 키/값 연관 배열이 필요할때 ****
			- TreeMap > HashMap + 정렬
			- HashTable -(잘안씀)
		
			- Properties > JSON, XML 대체 -(잘안씀)
		
		
		
		
		*/
		
		
		
		
	}
}
