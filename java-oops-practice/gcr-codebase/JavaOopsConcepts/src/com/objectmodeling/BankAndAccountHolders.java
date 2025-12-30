package com.objectmodeling;

import java.util.ArrayList;

 class Bank {

    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Open account for customer
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName()
                + " in " + bankName);
    }

    // Display bank customers
    public void displayCustomers() {
        System.out.println("\nBank: " + bankName);
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
        }
    }

    public String getBankName() {
        return bankName;
    }
}
 
 

  class Customer {

     private String name;
     private Bank bank;                      
     private ArrayList<Double> accounts;     

     // Constructor
     public Customer(String name) {
         this.name = name;
         this.accounts = new ArrayList<>();
     }

     // Link customer with bank
     public void setBank(Bank bank) {
         this.bank = bank;
     }

     // Add account with balance
     public void addAccount(double balance) {
         accounts.add(balance);
     }

     // View all balances
     public void viewBalance() {
         System.out.println("\nCustomer: " + name);
         System.out.println("Bank: " + bank.getBankName());
         for (int i = 0; i < accounts.size(); i++) {
             System.out.println("Account " + (i + 1) +
                     " Balance: " + accounts.get(i));
         }
     }

     public String getName() {
         return name;
     }
 }



public class BankAndAccountHolders {
	
	 public static void main(String[] args) {

	        // Create Bank
	        Bank bank = new Bank("State Bank of India");

	        // Create Customers
	        Customer c1 = new Customer("Anuj");
	        Customer c2 = new Customer("Rahul");

	        // Associate customers with bank
	        c1.setBank(bank);
	        c2.setBank(bank);

	        // Open accounts
	        bank.openAccount(c1);
	        bank.openAccount(c2);

	        // Customers add multiple accounts
	        c1.addAccount(5000);
	        c1.addAccount(12000);

	        c2.addAccount(8000);

	        // View balances
	        c1.viewBalance();
	        c2.viewBalance();

	        // Display bank customers
	        bank.displayCustomers();
	    }

}
