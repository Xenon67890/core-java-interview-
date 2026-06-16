package com.rays.basics;

import java.util.Arrays;

public class High5ElementInArray {
	
	public static void main(String[] args) {
		
		int[] a = {23, 67, 94, 64, 72, 68, 39};
		
		Arrays.sort(a);
		
		for(int i = a.length - 2; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
