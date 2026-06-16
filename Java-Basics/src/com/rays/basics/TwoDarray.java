package com.rays.basics;

public class TwoDarray {
	
	public static void main(String[] args) {
		
		int s[][] = new int[10][10];
		
		for(int i = 0; i<s.length; i++) {
			
			
			for(int j = 0; j<s.length;j++) {
				
				s[i][j] = (i + 1)*(j + 1);
				System.out.print(s[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
