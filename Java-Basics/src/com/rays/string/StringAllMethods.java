package com.rays.string;

public class StringAllMethods {
	
	public static void main(String[] args) {
		
		String s = "Vishwakarma";
		
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.concat(" vedik"));
		System.out.println(s.replace('m', 'n'));
		System.out.println(s.trim());
		System.out.println(s.indexOf("Vishwakarma"));
		System.out.println(s.indexOf('z'));
		System.out.println(s.lastIndexOf('m'));
	//	System.out.println(s.split(s));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("vedik"));
		
	}

}
