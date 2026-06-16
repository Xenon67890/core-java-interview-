package com.rays.basics;

public class Diamond {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(2 * i - 3); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 3); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
