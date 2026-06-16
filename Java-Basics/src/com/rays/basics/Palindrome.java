package com.rays.basics;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n = 1331;
		
		int temp = n;
		
		int rev = 0;
		
		while (temp > 0) {
			
			int digit = temp%10;
			
			rev = rev*10 + digit;
			
			temp = temp/10;
		}
		
		if(rev == n) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
