package com.oopspillars.ecommerceplatform;

//Main class
public class ECommerceApp {

 public static void main(String[] args) {

     // Creating products
     Product p1 = new Electronics(101, "Laptop", 60000);
     Product p2 = new Clothing(102, "Jacket", 5000);
     Product p3 = new Groceries(103, "Rice Bag", 2000);

     // Storing products in array 
     Product[] products = { p1, p2, p3 };

     // Calculating final price for each product
     for (Product product : products) {
         BillingService.printFinalPrice(product);
     }
 }
}

