package com.rays.string;

public class SpaceCount {
	
	public static void main(String[] args) {
		
		String s = "ram is a good boy";
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == ' ') {
				count++;
				
				System.out.print(i + ", ");
			}
		}
		
		System.out.println("occurance of spaces " + count);
	}

}
