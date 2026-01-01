package com.oopspillars.vehiclerentalsystem;

//Abstract class representing a generic Vehicle
abstract class Vehicle {

 // Encapsulated fields
 private String vehicleNumber;
 private String type;
 protected double rentalRate; // accessible to subclasses

 // Constructor to initialize vehicle details
 public Vehicle(String vehicleNumber, String type, double rentalRate) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
 }

 // Getter methods (Encapsulation)
 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public String getType() {
     return type;
 }

 public double getRentalRate() {
     return rentalRate;
 }

 // Abstract method to calculate rental cost
 public abstract double calculateRentalCost(int days);
}
