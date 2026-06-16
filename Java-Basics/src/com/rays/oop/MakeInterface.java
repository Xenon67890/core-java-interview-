package com.rays.oop;

public interface MakeInterface {

	public static final String NAME = "vedik";

	public static final int NUM = 30;

	public int sum(int a, int b);

	public static void staticMethod() {
		System.out.println("Staic Method");
	}

	public default void defaultMethod() {
		System.out.println("default method");
	}

}
