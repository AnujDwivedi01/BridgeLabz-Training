package com.oopspillars.vehiclerentalsystem;

//Car class with insurance support
class Car extends Vehicle implements Insurable {

 // Sensitive data kept private
 private String insurancePolicyNumber;

 public Car(String vehicleNumber, double rentalRate, String policyNumber) {
     super(vehicleNumber, "Car", rentalRate);
     this.insurancePolicyNumber = policyNumber;
 }

 // Rental cost calculation for car
 @Override
 public double calculateRentalCost(int days) {
     return rentalRate * days;
 }

 // Insurance calculation
 @Override
 public double calculateInsurance() {
     return 500; // fixed insurance amount
 }

 @Override
 public String getInsuranceDetails() {
     return "Car Insurance | Policy No: ****" +
             insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
 }
}
