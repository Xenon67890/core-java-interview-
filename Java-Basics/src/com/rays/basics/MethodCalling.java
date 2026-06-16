package com.rays.basics;

public class MethodCalling {

	public int indexfind(int a, int[] n) {

		int temp = -1;

		for (int i = 0; i < n.length; i++) {
			if (n[i] == a) {
				temp = i;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		
		int[] n = {2, 3, 4, 5, 6, 7, 8};	
		
		MethodCalling m = new MethodCalling();
		
		System.out.println(m.indexfind(4, n));

	}

}
