package com.rays.basics;

public class LargestNo {

	public static void main(String[] args) {

		int[] num = { 65, 21, 12, 46, 90, 67, 92 };

		int largest = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest) {
				largest = num[i];
			}

		}
		System.out.println("largest no in array: " + largest);
	}

}
