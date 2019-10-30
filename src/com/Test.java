package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(1);
		System.out.println(countPairs(list, 1));
		System.out.println(countPairs_1(list, 1));
	}

	public static int countPairs(List<Integer> numbers, int k) {
		Set<Integer> nums = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (nums.add(numbers.get(i))) {
				for (int j = i + 1; j < numbers.size(); j++) {
					if (numbers.get(i) + k == numbers.get(j)) {
						count++;
						break;
					}
				}
			}
		}

		return count;
	}

	public static int countPairs_1(List<Integer> numbers, int k) {
		Set<Integer> nums = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < numbers.size(); i++) {
			nums.add(numbers.get(i));
		}
		
		for (Integer integer : nums) {
			
			if(nums.contains(integer+k)) {
				count++;
			}
		}

		return count;
	}
}
