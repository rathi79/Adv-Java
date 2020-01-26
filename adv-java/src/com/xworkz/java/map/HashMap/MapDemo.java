package com.xworkz.java.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Character> map=new HashMap<Integer, Character>();
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'D');
		map.put(5, 'E');
		
		System.out.println("Is 'A' is present in a Map: "+ map.containsValue('A'));
		System.out.println("Get a letter first leter: "+map.get(1));
		System.out.println("Key set of a map: "+map.keySet());
		System.out.println("put if it is absent:"+map.putIfAbsent(6,'F'));
		System.out.println("Enry set of a map: "+map.entrySet());
		System.out.println("Is map contains a key 1:"+map.containsKey(1));
		
		
		System.out.println("Map entries are :");
		for(Map.Entry<Integer, Character> e: map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
