package com.rays.basics;

public class PrimeNo100 {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++) {
			boolean flag = true;
			
			for(int j = 2; j <= i - 1; j++) {
				if(i % j == 0) {
					flag =false;
				}
			}
			
			if (flag) {
				System.out.println("prime no is = "+i);
			}
		}
	}

}
