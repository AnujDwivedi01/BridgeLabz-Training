package com.shoppingcart;


class Product {

 // Encapsulated data 
 private String productName;
 private double price;

 // Constructor to initialize product details
 public Product(String productName, double price) {
     this.productName = productName;
     this.price = price;
 }

 // Getter methods to access private data
 public String getProductName() {
     return productName;
 }

 public double getPrice() {
     return price;
 }
}

