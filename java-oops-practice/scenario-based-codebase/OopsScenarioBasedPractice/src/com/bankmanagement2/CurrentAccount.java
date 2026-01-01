package com.bankmanagement2;

//CurrentAccount entity
class CurrentAccount extends Account {

 public CurrentAccount(String customerName, double balance) {
     super(customerName, balance);
 }

 @Override
 public void displayAccountType() {
     System.out.println("Account Type: Current Account");
 }
}

