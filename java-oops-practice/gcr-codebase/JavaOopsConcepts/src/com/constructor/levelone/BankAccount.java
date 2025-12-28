package com.constructor.levelone;

//Parent class
public class BankAccount {

 // Public variable - accessible everywhere
 public int accountNumber;

 // Protected variable - accessible in subclass
 protected String accountHolder;

 // Private variable - accessible only within this class
 private double balance;

 // Constructor to initialize bank account details
 public BankAccount(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Public method to get balance (encapsulation)
 public double getBalance() {
     return balance;
 }

 // Public method to update balance (encapsulation)
 public void setBalance(double balance) {
     if (balance >= 0) {
         this.balance = balance;
     } else {
         System.out.println("Invalid balance amount");
     }
 }
}

