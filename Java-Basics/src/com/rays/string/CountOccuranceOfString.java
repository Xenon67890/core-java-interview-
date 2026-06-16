package com.rays.string;

public class CountOccuranceOfString {
	
	public static void main(String[] args) {
		
		String s = "vijay chauhan";
		int count  = 0;
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			
			for(int i = 0; i < s.length(); i++) {
				
				if(ch == s.charAt(i)) {
					count++;
				}
			}
			
			if(count != 0) {
				System.out.println(ch + ": " + count);
				count = 0;
			}
		}
	}

}
