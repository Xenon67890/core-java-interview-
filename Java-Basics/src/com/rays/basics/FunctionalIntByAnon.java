package com.rays.basics;

public class FunctionalIntByAnon {
	
	public static void main(String[] args) {
		
		FunctionalInt f = new FunctionalInt() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		
		int a = 4;
		
		int b = 7;
		
		System.out.println(f.sum(a, b));
	}

} 
