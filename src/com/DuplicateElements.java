package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DuplicateElements {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(8);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(2);
		System.out.println(countNonUnique(list));

	}

	public static int countNonUnique(List<Integer> numbers) {
		int count=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer >();
		for (Integer integer : numbers) {
			if(map.containsKey(integer)) {
				map.put(integer, 1);
			}
			else {
				map.put(integer, 0);
			}
		}
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			count=count+integer;
		}
		
		return count;

	}
}
