package com.rays.oop;

public class MethodOverLoading {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		MethodOverLoading m = new MethodOverLoading();

		m.sum(2, 5);
		m.sum(3, 6, 8);
	}

}
