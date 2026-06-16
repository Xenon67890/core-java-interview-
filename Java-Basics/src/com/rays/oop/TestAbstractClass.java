package com.rays.oop;

public class TestAbstractClass extends AbstractClass {

	public TestAbstractClass(String name) {
		super(name);
		System.out.println(name);
	}

	@Override
	public void show() {
		System.out.println("show method");

	}
	
	public static void main(String[] args) {
		
		TestAbstractClass a = new TestAbstractClass("vedik");
		
		a.simple();
		a.show();
		
		AbstractClass.simple();
	}

}
