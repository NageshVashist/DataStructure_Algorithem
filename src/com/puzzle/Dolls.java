package com.puzzle;

import java.util.Arrays;

public class Dolls {
	public static void main(String[] args) {
		boolean isDone = false;
		int[] arr = new int[] { 1, 3, 2, 5, 2, 6, 9, 6, 7,4, 3 ,9,3,5};
		int c = 0;
		while (!isDone) {
			int[] trr = arr;
			int[] t = new int[1];
			t[0] = arr[0];
			arr[0] = 0;

			for (int i = 1; i < arr.length; i++) {
				int[] js = addDoll(t, arr[i]);
				if (js != null) {
					t = js;
				}
				if (js != null) {
					arr[i] = 0;
				}
			}
			trr = Arrays.stream(arr).filter(i -> i != 0).toArray();
			

			for (int i : t) {
				System.out.print(i);
			}
			if (trr.length==0) {
				isDone = true;
				c ++;
				break;
			}

			c++;
		}

		System.out.println("\nnumber of dolls sets :" + c);
	}

	public static int[] addDoll(int[] d, int n) {

		if (d.length == 0) {
			return new int[] { n };

		}
		for (int i = d.length - 1; i >= 0; i--) {
			if (n > d[i]) {
				int[] t = Arrays.copyOf(d, d.length + 1);
				t[d.length] = n;
				return t;
			} else if (n == d[i]) {
				return null;
			} else {
				int[] t = Arrays.copyOfRange(d, 0, i);
				int[] r = addDoll(t, n);
				if (r == null) {
					return null;
				} else {
					int[] k = Arrays.copyOf(r, d.length + 1);
					k[d.length] = d[i];
					return k;
				}
			}

		}

		return d;
	}

}