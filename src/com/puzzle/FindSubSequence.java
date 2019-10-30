package com.puzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSubSequence {

	private static String vol = "aeiou";
	private static int c = 0;

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int tc = sn.nextInt();
		for (int i = 0; i < tc; i++) {
			int c = sn.nextInt();
			String string = sn.next();
			arr.add(string);
			if (string.length() != c) {
				c = 0;
				System.out.println("invalid string length: " + string.length());
				return;
			}
		}
		for (String string : arr) {
			if (string.length() < 2) {
				System.out.println(0);
			} else {
				c = 0;
				findSequence(string);
				System.out.println(c);
			}

		}

	}

	public static void findSequence(String str) {
		String s = "";
		char[] scharArr = str.toCharArray();
		List<String> sqArr = new ArrayList();

		for (int i = 1; i < scharArr.length; i++) {
			if (s.isEmpty() && i == 1) {
				c++;
				s = "" + scharArr[0];
			}

			if (vol.contains("" + s.charAt(s.length() - 1)) && !vol.contains("" + scharArr[i])) {

				c++;
				if (i != 0) {
					System.out.println("" +s.charAt(s.length() - 1)+ scharArr[i] );
					s += "" + scharArr[i];
				}
			}

			else if (!vol.contains("" + s.charAt(s.length() - 1)) && vol.contains("" + scharArr[i])) {

				c++;
				if (i != 0) {
					System.out.println("" +s.charAt(s.length() - 1)+ scharArr[i] );
					s += "" + scharArr[i];
				}
			} else {
				if (s.length() > 2) {
					// s += "" + scharArr[i];
					sqArr.add(s);
				}
				s = "" + scharArr[i];
			}

		}

		for (String st : sqArr) {
			findPairs(st);
		}

	}

	private static void findPairs(String s) {

		char[] array = s.toCharArray();
		for (int n = 3; n < array.length; n++) {

			for (int i = 0, j = n; j <= array.length; i++, j++) {
				System.out.println(s.substring(i, j));
				c++;
			}
		}
//		c++;
	}

}
