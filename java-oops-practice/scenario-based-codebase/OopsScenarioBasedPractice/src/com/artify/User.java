package com.artify;

public class User {
	
	 private String name;
	 private double walletBalance;
	 
	 
	 public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	 }
	 
	 public void deductBalance(double amount) {
		 if(amount>0 && amount<=walletBalance) {
			 walletBalance -= amount;
			 System.out.println(amount + " : Amount has been deducted");
			 return;
		 }
		 else {
			 System.out.println("Invalid amount entered");
			 return;
		 }
		 
	 }
	 
	 public double getWalletBalance() {
		 return this.walletBalance;
	 }

}
