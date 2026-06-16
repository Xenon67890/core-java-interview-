package com.rays.basics;

public class SecondLargestNo {

	public static void main(String[] args) {

		int[] num = { 21, 34, 65, 73, 95, 36 };

		int largest = 0;

		int second = 0;

		for (int i = 0; i < num.length; i++) {

			if (largest < num[i]) {

				second = largest; // second = 73

				largest = num[i]; // largest = 95
			}
			if (second < num[i] && largest > num[i]) {
				second = num[i];  
			}
		}
		System.out.println("second largest  no: " + second );
	}
}
