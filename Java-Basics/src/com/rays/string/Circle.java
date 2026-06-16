package com.rays.string;

public class Circle extends Shape {

	private Integer radius;

	
	
	public Integer getRadius() {
		return radius;
	}



	public void setRadius(Integer radius) {
		this.radius = radius;
	}



	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println(c.radius);
	}
}
