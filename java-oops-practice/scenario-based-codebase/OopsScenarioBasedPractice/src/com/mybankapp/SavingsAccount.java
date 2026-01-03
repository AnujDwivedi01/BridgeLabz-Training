package com.mybankapp;

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public SavingsAccount(String accNo) {
        super(accNo);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE / 100;
        setBalance(getBalance() + interest);
        System.out.println("Savings Account Interest Added: ₹" + interest);
    }
}
