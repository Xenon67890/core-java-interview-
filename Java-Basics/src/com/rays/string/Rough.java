package com.rays.string;

public class Rough {

	public static void main(String[] args) {

		int[] s = { 1, 3, 4, 5, 7, 8 };

		int num = 3;

		int k = -1;

		for (int i = 0; i < s.length; i++) {

			if (num == s[i]) {
				
				k = i;
			}
			
		}
		System.out.println(k);
	}
}
