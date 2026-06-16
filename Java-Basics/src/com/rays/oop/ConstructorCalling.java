package com.rays.oop;

public class ConstructorCalling {

	public String firstName;

	public String lastName;

	public String address;

	public ConstructorCalling(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println(firstName);
		System.out.println(lastName);
	}

	public ConstructorCalling(String firstName, String lastName, String address) {
		this(firstName, lastName);
		this.address = address;

		System.out.println(address);
	}

}
