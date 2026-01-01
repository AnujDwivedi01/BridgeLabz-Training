package com.oopspillars.vehiclerentalsystem;

//Truck class with insurance support
class Truck extends Vehicle implements Insurable {

 private String insurancePolicyNumber;

 public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
     super(vehicleNumber, "Truck", rentalRate);
     this.insurancePolicyNumber = policyNumber;
 }

 // Rental cost calculation for truck (higher rate)
 @Override
 public double calculateRentalCost(int days) {
     return rentalRate * days * 1.2; // extra charge for heavy vehicle
 }

 // Insurance calculation
 @Override
 public double calculateInsurance() {
     return 1000; // fixed insurance amount
 }

 @Override
 public String getInsuranceDetails() {
     return "Truck Insurance | Policy No: ****" +
             insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
 }
}

