package com.rays.oop.ShapeArrayWOC;

public class Triangle extends Shape {

	public double height;
	
	public double base;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public double area() {
		
		return 0.5 * base* height;
	}
}
