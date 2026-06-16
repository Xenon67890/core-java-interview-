package com.rays.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s = "care";
		String t = "race";
		
		if(s.length() == t.length()) {
			
			char[] u = s.toCharArray();
			char[] v = t.toCharArray();
			
			Arrays.sort(v);
			Arrays.sort(u);
			
			if(Arrays.equals(u, u)) {
				System.out.println("this is anagram");
			}else {
				System.out.println("this is not anagram");
			}
			
		}else {
			System.out.println("this is not anagram");
		}
		
				
	}
}
