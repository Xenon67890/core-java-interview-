package com.rays.oop.constructorCalling;

public class TestConstructorCalling extends ConstructorCalling {
	
	public TestConstructorCalling(String name, String address) {
		super(name, address);
	}
	
	public static void main(String[] args) {
		
		ConstructorCalling c = new ConstructorCalling("vedik", "indore");
	}

}
