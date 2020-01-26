package com.xworkz.java.map.treeMap;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer code1, Integer code2) {
		if(code1<code2)
			return 1;
		else if(code1>code2)
			return -1;
		else
			return 0;
	}

}
