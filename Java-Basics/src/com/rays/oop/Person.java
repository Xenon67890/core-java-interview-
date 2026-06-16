package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String firstName;

	private String lastName;

	private Date dob;

	public static final int AVGAGE = 30;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Person p = new Person();
		
		p.setFirstName("vedik");
		p.setLastName("vishwakarma");
		p.setDob(sdf.parse("01-01-2025"));
		
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(Person.AVGAGE);
		
	}

}
