package com.rays.string;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello java");
		
		System.out.println(sb.capacity());
		
		sb.append("world"); 
		
		System.out.println(sb.length());
		
		sb.reverse();  
		
		
		sb.delete(0, 4); 
		
		System.out.println(sb.length());
		
		System.out.println(sb);
		
		sb.insert(5, "ok1223334444555556666667777777888888889999999999999"); 
		
	
		
		//sb.capacity(); // 
		
		
		
		System.out.println(sb.capacity());
	}
}
