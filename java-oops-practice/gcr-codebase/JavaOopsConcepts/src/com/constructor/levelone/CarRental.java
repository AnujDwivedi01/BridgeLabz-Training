package com.constructor.levelone;

public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 1500;

    // Default constructor
    public CarRental() {
        this("Customer", "Basic", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + calculateTotalCost());
    }

 
}

