package com.rays.oop;

public class TestConstructorCalling extends ConstructorCalling {
	
	public TestConstructorCalling(String firstName, String lastName, String address) {
		super(firstName, lastName, address);
	}
	
	public static void main(String[] args) {
		
		TestConstructorCalling t = new TestConstructorCalling("vedik", "vishwakarma", "indore");
	}
	

}
