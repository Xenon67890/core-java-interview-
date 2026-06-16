package com.rays.string;

public class DuplicateCharacter {
	
	public static void main(String [] args) {
		
		String s = "vishwakarma";
		
		for(int i = 0; i < s.length(); i++) {
			
			for(int k = i+1; k < s.length(); k++) {
				
				if(s.charAt(i) == s.charAt(k)) {
					
					System.out.println(s.charAt(i));
					
				}
				
			}
			
		}
		
	}

}
