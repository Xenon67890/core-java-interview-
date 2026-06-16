package com.rays.oop.constructorCalling;

public class ConstructorCalling {

	public String name;

	public String address;

	public ConstructorCalling() {
		
		System.out.println("parent default constructor.!!!!!!");
	}

	public ConstructorCalling(String name) {

		this();
		this.name = name;
		System.out.println(name);
	}

	public ConstructorCalling(String name, String address) {

		this(name);
		this.address = address;
		System.out.println(address);
	}

}
