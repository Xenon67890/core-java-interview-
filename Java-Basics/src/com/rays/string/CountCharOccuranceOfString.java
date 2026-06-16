package com.rays.string;

public class CountCharOccuranceOfString {
	
	public static void main(String [] args) {
		
		String s = "appointment";
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 'p') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
