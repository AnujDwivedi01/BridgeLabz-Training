package com.oopspillars.vehiclerentalsystem;

//Bike class with insurance support
class Bike extends Vehicle implements Insurable {

 private String insurancePolicyNumber;

 public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
     super(vehicleNumber, "Bike", rentalRate);
     this.insurancePolicyNumber = policyNumber;
 }

 // Rental cost calculation for bike
 @Override
 public double calculateRentalCost(int days) {
     return rentalRate * days;
 }

 // Insurance calculation
 @Override
 public double calculateInsurance() {
     return 200; // fixed insurance amount
 }

 @Override
 public String getInsuranceDetails() {
     return "Bike Insurance | Policy No: ****" +
             insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
 }
}

