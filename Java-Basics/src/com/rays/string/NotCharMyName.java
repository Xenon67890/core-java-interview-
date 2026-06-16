package com.rays.string;

public class NotCharMyName {
	
	public static void main(String [] args) {
		
		String s = "vishwakarma";
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			
			if(s.indexOf(ch) == (-1)){
				
				System.out.print(ch + " ,");
			}
		}
	}

}
