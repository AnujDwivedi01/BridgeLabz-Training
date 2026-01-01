package com.bankmanagement2;

//SavingsAccount entity
class SavingsAccount extends Account {

 private double interestRate;

 public SavingsAccount(String customerName, double balance, double interestRate) {
     super(customerName, balance);
     this.interestRate = interestRate;
 }

 // Verb: calculateInterest
 public void calculateInterest() {
     double interest = balance * interestRate / 100;
     System.out.println("Interest Earned: ₹" + interest);
 }

 @Override
 public void displayAccountType() {
     System.out.println("Account Type: Savings Account");
 }
}

