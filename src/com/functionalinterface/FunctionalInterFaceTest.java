package com.functionalinterface;

import java.util.stream.Stream;

public class FunctionalInterFaceTest {
	public static void main(String[] args) {
		MyFunctionalInterface<String> s = (x) -> x.length() > 7;

		String[] names = { "Nagesh", "Neelam", "Khushaan", "Vihaan" };

		Stream.of(names).parallel().forEach(a -> {
			System.out.println(s.filter(a));
		});
	}
}
