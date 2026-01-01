package com.bankmanagement;

public class BankAccount {
	
	// instance variable
	protected String customerName;
	protected double balance;
	
	//constructor
	 BankAccount(String customerName, double balance) {
		this.customerName = customerName;
		this.balance = balance;
		
	}
	
	
	// for deposit
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " : has been added to your account");
	}
	
	// for withdraw
	
	public void withdraw(double amount) {
		 if(amount <= balance) {
			 balance-=amount;
			 System.out.println(amount + " : withdrawed to your account remaining balance : "+ balance );
		 }
		 else {
			 System.out.println("Insufficient balance");
		 }
	}

}
