package com.oopspillars.ecommerceplatform;


class BillingService {

 // Method using Product reference 
 public static void printFinalPrice(Product product) {

     double price = product.getPrice();
     double discount = product.calculateDiscount();
     double tax = 0;

     // Check if product is taxable
     if (product instanceof Taxable) {
         tax = ((Taxable) product).calculateTax();
     }

     double finalPrice = price + tax - discount;

     System.out.println("Product       : " + product.getName());
     System.out.println("Base Price    : " + price);
     System.out.println("Discount      : " + discount);
     System.out.println("Tax           : " + tax);
     System.out.println("Final Price   : " + finalPrice);
     System.out.println("--------------------------------");
 }
}

