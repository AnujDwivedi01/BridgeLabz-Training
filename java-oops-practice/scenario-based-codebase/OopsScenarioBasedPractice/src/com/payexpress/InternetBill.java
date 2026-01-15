package com.payexpress;

import java.time.LocalDate;


class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate, 50);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Internet bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Internet services may be suspended if unpaid.");
    }
}
