package com.xworkz.java.map.treeMap;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo  {	

	public static void main(String[] args) {
		TreeMap<Integer, String> collegeEntries = new TreeMap<Integer, String>(new MyComparator());
		collegeEntries.put(8206, "AEC College");
		collegeEntries.put(143, "SSGEC College");
		collegeEntries.put(238, "GND College");
		collegeEntries.put(108, "KLE College");
		collegeEntries.put(100, "Jain College");

		for(Map.Entry<Integer, String> collegeEntry: collegeEntries.entrySet()) {
			System.out.println(collegeEntry.getKey()+":"+collegeEntry.getValue());
		}
	}

	

}
