package com.rays.basics;

public class PrimeNo {

	public static void main(String[] args) {
		
		int n = 15;
		
		boolean flag = true;
		
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println(n + " is prime no");
		}else {
			System.out.println(n + " is not prime no");
		}

	}

}
