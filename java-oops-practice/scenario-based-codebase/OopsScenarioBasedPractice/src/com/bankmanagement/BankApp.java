package com.bankmanagement;

public class BankApp {
       public static void main(String[] args) {
    	   
    	   // creating objects
    	   
    	   SavingsAccount savings = new SavingsAccount("Anuj" , 5000, 4.5);
    	   CurrentAccount current = new CurrentAccount("Rahul" , 30000);
    	   
    	   System.out.println("---- Savings Account ----");
           savings.deposit(5000);
           savings.withdraw(2000);
           savings.calculateInterest();
           
           System.out.println("\n---- Current Account ----");
           current.deposit(10000);
           current.withdraw(5000);
       }
}
