package com.inheritance.hierarchicalinheritance.problem1;

class CheckingAccount extends BankAccount {

    private double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type       : Checking Account");
        System.out.println("Withdrawal Limit  : ₹" + withdrawalLimit);
    }
}
