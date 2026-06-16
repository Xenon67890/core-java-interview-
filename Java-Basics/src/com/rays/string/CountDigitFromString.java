package com.rays.string;

public class CountDigitFromString {
	
	public static void main(String [] args) {
		
		String s = "hello1234java";
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				
				count++;
				
			}
			
		}
		
		System.out.println("count " + count);
	}

}
