package com.rays.oop;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println(balance);
	}

	public void withdrawal(int amount) {
		
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println(balance);
		}else {
			System.out.println("insufficient fund");
		}
		
	}
	
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setBalance(23000);
		a.deposit(1500);
		a.withdrawal(15000);
	}
}
