package com.rays.string;

public class CharOccurance {

	public static void main(String[] args) {

		String s = "vishwakarma";
		char ch = 'a';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ch) {
				count++;
				
			}
			
		}
		System.out.println(ch + " count : " + count);
	}

}
