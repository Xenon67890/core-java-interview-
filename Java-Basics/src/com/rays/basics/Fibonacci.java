package com.rays.basics;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int b = 1;
		
		int temp;
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(a + ", ");
			
			temp = a+b;
			a = b;
			b = temp;
		}
	}
}
