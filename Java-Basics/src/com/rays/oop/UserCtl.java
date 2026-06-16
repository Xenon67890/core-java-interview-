package com.rays.oop;

public class UserCtl extends BaseCtl {

	@Override
	public void preload() {
		System.out.println("user preload");
	}

	public static void main(String[] args) {

		BaseCtl b = new UserCtl();

		UserCtl u = new UserCtl();

		u.preload();   // overriding ka result
		
		u.getView();   // inheritance
		
		b.preload();   // dynamic polymorphism
		
		b.getView();   // normal parent method call
	}

}
