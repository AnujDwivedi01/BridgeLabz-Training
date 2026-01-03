package com.cabbygoarideapp;

public class Driver {
	   
	   // instance variable
       private String name;
       private String licenseNumber;
       private double rating;
       
       // constructor
	   public Driver(String name, String licenseNumber, double rating) {		
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	   }
	   
	   public double getRating() {
	        return rating;
	    }

	    public void displayDriver() {
	        System.out.println("Driver Name: " + name);
	        System.out.println("License No: " + licenseNumber);
	        System.out.println("Rating: " + rating);
	    }
       
       
       
       
}
