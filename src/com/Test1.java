package com;

import java.io.File;

public class Test1 {
	int i;

	public static void main(String[] args) {
		System.out.println(print(null));
	}

	public static int print(Object obj) {
		File f;
		try {
			f = new File("C:\\Users\\Nagash\\Documents\\spring-workspace\\Learning\\src\\com\\SubString.java");
			obj.toString().length();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			return 0;
		}
	}

}
