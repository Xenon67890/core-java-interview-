package com.rays.oop;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(20000);
		a.deposit(1000);
		a.withdrawal(30000);
	}

}
