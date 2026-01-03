package com.mybankapp;

class CurrentAccount extends Account {
	private static final double INTEREST_RATE = 1.5;

	public CurrentAccount(String accNo, double balance) {
		super(accNo, balance);
	}

	public CurrentAccount(String accNo) {
		super(accNo);
	}

	@Override
	public void calculateInterest() {
		double interest = getBalance() * INTEREST_RATE / 100;
		setBalance(getBalance() + interest);
		System.out.println("Current Account Interest Added: ₹" + interest);
	}
}
