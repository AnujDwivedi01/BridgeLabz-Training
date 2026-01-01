package com.bankmanagement2;

//Base class representing common Account entity
abstract class Account {

 protected String customerName;
 protected double balance;

 public Account(String customerName, double balance) {
     this.customerName = customerName;
     this.balance = balance;
 }

 // Verb: deposit
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: ₹" + amount + " | Balance: ₹" + balance);
 }

 // Verb: withdraw
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: ₹" + amount + " | Balance: ₹" + balance);
     } else {
         System.out.println("Insufficient Balance");
     }
 }

 // Responsibility decided by subclass
 public abstract void displayAccountType();
}

