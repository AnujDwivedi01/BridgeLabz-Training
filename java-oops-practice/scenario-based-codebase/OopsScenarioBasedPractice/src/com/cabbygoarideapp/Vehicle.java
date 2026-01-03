package com.cabbygoarideapp;

public abstract class Vehicle {
       
	 // instance variable
	 protected String vehicleNumber;
	 protected int capacity;
	 protected String type;
	 protected double ratePerKm;
	 
	 private double fare;
	 private String location;
	 
	 // constructor
	 public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.ratePerKm = ratePerKm;
	 }
	 
	 //fare calculation
	 
	 public void calculateFare(double baseFare, double distance) {
		   fare = baseFare + (distance * ratePerKm);
	 }
	 
	 // getter for fare
	    public double getFare() {
	        return fare;
	    }

	    // getter for vehicle type
	    public String getType() {
	        return type;
	    }
	 
	 
}
