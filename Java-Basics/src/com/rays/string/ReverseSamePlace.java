package com.rays.string;

public class ReverseSamePlace {

	public static void main(String[] args) {

		String s = "vedik vishwakarma is a java Student";

		String[] p = s.split(" ");

		for (String k : p) {

			for (int i = k.length() - 1; i >= 0; i--) {

				System.out.print(k.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
