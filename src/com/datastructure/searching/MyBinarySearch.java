package com.datastructure.searching;

public class MyBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 12, 14, 15, 24, 45, 56, 66, 57, 89, 90 };
		System.out.println(search(arr, 0, arr.length - 1, 13));
	}

	public static int search(int[] arr, int s, int e, int v) {
		if (e > s) {
			int m = s + (e - s) / 2;
			if (arr[m] == v) {
				return v;
			}
			if (v < arr[m]) {
				return search(arr, s, m - 1, v);
			}
			return search(arr, m + 1, e, v);

		} else if (arr[s] == v) {
			return arr[s];
		}

		return -1;
	}
}
