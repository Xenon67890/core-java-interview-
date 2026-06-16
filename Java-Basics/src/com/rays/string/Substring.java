package com.rays.string;

import com.rays.basics.Test;

public class Substring {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		
		String s = "complimentry";
		
		System.out.println(s.substring(3)); // isme 3 index se values lega
		
		System.out.println(s.substring(3, 8)); // isme 3 index se leke 8 ke pehle tak ex-->8-3=5, 3 se leke 5 indexes tak 
		
		System.out.println(s.substring(4, 7)); // isme 7-4=3, 4 se leke 3 indexes tak
		
	}

}
