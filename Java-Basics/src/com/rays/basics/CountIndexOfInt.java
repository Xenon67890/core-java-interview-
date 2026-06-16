package com.rays.basics;

public class CountIndexOfInt {

	public static void main(String[] args) {

		int[] s = { 1, 3, 5, 7, 9, 4 };
		
		int num = 5;
		
		int k = -1;
		
		for(int i = 0; i < s.length; i++) {
			
			if(s[i] == num) {
				
				k = i;
			}
		}
		System.out.println("index : " + k);

	}

}
