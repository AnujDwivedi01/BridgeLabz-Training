package com.inheritance.hierarchicalinheritance.problem1;

public class BankApp {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1001, 50000, 4.5);
        CheckingAccount checking = new CheckingAccount(1002, 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(1003, 200000, 5);

        savings.displayAccountType();
        System.out.println();

        checking.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}
