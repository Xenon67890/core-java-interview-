package com.rays.basics;

public class CountNoOfInt {

	public static void main(String[] args) {

		int[] s = { 2, 4, 5, 7, 8, 3, 6, 9 };

		int n = 1;

		int temp = -1;

		for (int i = 0; i < s.length; i++) {

			if (n == s[i]) {

				temp = n;
			}
		}
		System.out.println(temp);
	}

}
