package com.rays.basics;

public class MissingNoInArray {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4};
		
		int[] b = {1, 0, 2, 3, 8};
		
	//	boolean flag = false;
		
		for(int i = 0; i < b.length; i++) {
			boolean flag = false;
			for(int j = 0; j < a.length; j++) {
				if(b[i] == a[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(b[i]);
			}
		}
	}

}
