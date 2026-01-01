package com.bankmanagement;

public class SavingsAccount extends BankAccount{
           //private variable
	       private double interestRate;
	       
	       //constructor
	       public SavingsAccount(String customerName,double balance, double interestRate){
	    	   super(customerName, balance);  // calling parent class
	    	   this.interestRate = interestRate;
	       }
	       
	       // calculating interest
	       
	       public void calculateInterest() {
	           double interest = balance * interestRate / 100;
	           System.out.println("Interest Earned: " + interest);
	       }
}
