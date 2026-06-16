package com.rays.basics;

public class swapping {
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		int c;
		
		System.out.println("before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("after swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
