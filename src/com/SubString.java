package com;

public class SubString {
	public static void main(String[] args) {
		String s="";
		String k="";
		int count=0;
		while(s.contains(k)) {
			s.replaceFirst(k, "");
			count++;
		}
		
	}
}
