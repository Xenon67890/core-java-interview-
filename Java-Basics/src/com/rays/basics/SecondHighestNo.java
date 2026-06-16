package com.rays.basics;

public class SecondHighestNo {
	
	public static void main(String[] args) {
		
		int[] a = {23, 54, 76 ,54 ,43, 87, 98};
		
		int first = 0;
		int second = 0;
		
		for(int num : a) {
			
			if(num > first) {
				second = first;
				first = num;
			}
			if(num > second && num != first) {
				second = num;
			}
		}
		
		System.out.println("second highest " + second);
	}

}
