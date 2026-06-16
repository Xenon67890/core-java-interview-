package com.rays.string;

import java.util.Arrays;

public class StringArray {
	
	public static void main(String [] args) {
		
		String[] k = {"ram", "shyam", "kamal", "vimal"};
		
		System.out.println(k[1]);
		
		for(String p:k) {
			System.out.println(p);
		}
		
		System.out.println(Arrays.toString(k));
	}

}
