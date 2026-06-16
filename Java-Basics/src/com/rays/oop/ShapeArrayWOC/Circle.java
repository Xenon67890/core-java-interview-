package com.rays.oop.ShapeArrayWOC;

public class Circle extends Shape {
	
	public double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}	
	
	
}
