package com.rays.oop;

public class TestExplicit extends Explicit {
	
	public TestExplicit(String name) {
		
		super(name);
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		TestExplicit t = new TestExplicit("vedik");
	}

}
