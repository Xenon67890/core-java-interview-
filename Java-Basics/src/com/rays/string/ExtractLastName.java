package com.rays.string;

public class ExtractLastName {
	
	public static void main(String[] args) {
		
		String s = "vijay chauhan";
		int count  = 0;
		
		// System.out.println(s.substring(6));
		
		System.out.println(s.substring(s.indexOf(" ") + 1));
	}

}
