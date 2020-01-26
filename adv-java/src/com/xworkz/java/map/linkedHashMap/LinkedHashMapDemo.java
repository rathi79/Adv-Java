package com.xworkz.java.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> asciiValues=new LinkedHashMap<Character,Integer>();
		asciiValues.put('A', 65);
		
		asciiValues.put('C', 67);
		asciiValues.put('D', 68);
		asciiValues.put('B', 66);
		
		for(Map.Entry<Character,Integer> asciiValue:asciiValues.entrySet()) {
			System.out.println("ASCII Value of "+asciiValue.getKey()+" : "+asciiValue.getValue());
		}
		

	}

}
