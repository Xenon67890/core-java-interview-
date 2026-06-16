package com.rays.basics;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			
			int a = (int)(Math.random()*99) + 1;
			System.out.println(a);
		}
	}

}
