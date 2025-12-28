package com.constructor.levelone;


public class SavingsAccount extends BankAccount {

 // Constructor calling parent constructor
 public SavingsAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

 // Method to display accessible details
 public void displayAccountDetails() {
     System.out.println("Account Number : " + accountNumber);      // public
     System.out.println("Account Holder : " + accountHolder);      // protected
     System.out.println("Balance        : " + getBalance());       // private via getter
 }

 public static void main(String[] args) {

     // Creating SavingsAccount object
     SavingsAccount account =
             new SavingsAccount(101, "Anuj Dwivedi", 5000.00);

     // Display details
     account.displayAccountDetails();

     // Modify balance using public method
     account.setBalance(7500.00);

     System.out.println("Updated Balance: " + account.getBalance());
 }
}

