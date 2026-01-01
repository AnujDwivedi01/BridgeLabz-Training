package com.bankmanagement2;

//Main / Object class
public class BankApp {

 public static void main(String[] args) {

     Account acc1 = new SavingsAccount("Anuj", 50000, 4.5);
     Account acc2 = new CurrentAccount("Rahul", 30000);

     acc1.displayAccountType();
     acc1.deposit(5000);
     acc1.withdraw(2000);
     ((SavingsAccount) acc1).calculateInterest();

     System.out.println();

     acc2.displayAccountType();
     acc2.deposit(10000);
     acc2.withdraw(5000);
 }
}

