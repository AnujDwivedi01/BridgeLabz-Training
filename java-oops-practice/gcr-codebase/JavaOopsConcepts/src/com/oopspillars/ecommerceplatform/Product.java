package com.oopspillars.ecommerceplatform;

       //Abstract base class for all products
         abstract class Product {

        	 // Encapsulated fields
        	 private int productId;
        	 private String name;
        	 private double price;

        	 // Constructor to initialize product details
        	 public Product(int productId, String name, double price) {
        	     this.productId = productId;
        	     this.name = name;
        	     this.price = price;
        	 }

        	// Getter methods 
        	 public int getProductId() {
        	     return productId;
        	 }

        	 public String getName() {
        	     return name;
        	 }

        	 public double getPrice() {
        	     return price;
        	 }

        	 // Setter method to allow controlled update
        	 public void setPrice(double price) {
        	     this.price = price;
        	 }

        	 // Abstract method for discount calculation
        	 public abstract double calculateDiscount();
        	}

