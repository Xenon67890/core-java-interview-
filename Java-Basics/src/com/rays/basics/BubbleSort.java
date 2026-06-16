package com.rays.basics;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] n = {5, 6, 7, 2, 8, 5, 4, 1, 9, 3};
		
		int temp = 0;
		
		for(int i = 0; i < n.length; i++) {
			 
			for(int j = i + 1; j < n.length; j++) {
				
				if(n[i] > n[j]) {
					
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
			System.out.print(n[i]);
		}
	}

}
