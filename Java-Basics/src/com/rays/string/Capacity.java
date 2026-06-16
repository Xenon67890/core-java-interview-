package com.rays.string;

public class Capacity {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("vvvvvvvvvv");
		
		sb.append("kkkk");
		
		sb.reverse(); //kkkkvvvvvvvvvv
		
		sb.delete(0, 5); // vvvvvvvvv
		
		sb.insert(5, "kkkkkk"); // vvvvvkkkkkkvvvv
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
	}

}
