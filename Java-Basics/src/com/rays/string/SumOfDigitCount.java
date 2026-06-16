package com.rays.string;


public class SumOfDigitCount {
	
	public static void main(String[] args) {
		
		String s = "abcd1234qwer";
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				
				count = count + Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(count);
	}

}
