package com.rays.string;

public class NotCharacterPresent {
	
	public static void main(String [] args) {
		
		String s = "vedik";
		
		for(char ch ='a';ch<='z'; ch++) {
			
			if(s.indexOf(ch) == -1) {
				
				System.out.println(ch);
			}
			
		}
		
	}

}
