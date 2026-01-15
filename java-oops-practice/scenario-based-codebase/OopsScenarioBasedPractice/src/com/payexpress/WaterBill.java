package com.payexpress;

import java.time.LocalDate;

class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate, 30);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Water bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Please clear your water bill on time.");
    }
}
