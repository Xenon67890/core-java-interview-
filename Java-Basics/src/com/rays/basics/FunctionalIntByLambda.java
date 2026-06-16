package com.rays.basics;

public class FunctionalIntByLambda {
	
	public static void main(String[] args) {
		
		FunctionalInt f = (a, b) -> {
			return a + b;
		};
		
		int a = 32;
		
		int b = 49;
		
		System.out.println(f.sum(a, b));
		
		f.multi(a, b);
		
		FunctionalInt.sub(a, b);
	}

}
