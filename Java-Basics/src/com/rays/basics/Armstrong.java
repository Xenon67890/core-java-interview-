package com.rays.basics;

public class Armstrong {

	public static void main(String[] args) {

		int n = 153;

		int temp = n;

		int sum = 0;
		
		while (temp > 0) {
			
			int digit = temp%10;  // % returns remainder
			
			sum = sum + digit*digit*digit;
			
			temp = temp/10;  // / returns quotient
			
		}
		
		if(n == sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}

	}

}
