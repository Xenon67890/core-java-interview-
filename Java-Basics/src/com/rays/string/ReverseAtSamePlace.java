package com.rays.string;

public class ReverseAtSamePlace {

	public static void main(String[] args) {

		String s = "vedik vishwakarma";

		String[] t = s.split(" ");

		for (String k : t) {

			for (int i = k.length() - 1; i >= 0; i--) {

				System.out.print(k.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
