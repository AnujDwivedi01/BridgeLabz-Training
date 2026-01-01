package com.oopspillars.ecommerceplatform;

//Clothing product - taxable
class Clothing extends Product implements Taxable {

 public Clothing(int productId, String name, double price) {
     super(productId, name, price);
 }

 // 20% discount on clothing
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.20;
 }

 // 12% tax
 @Override
 public double calculateTax() {
     return getPrice() * 0.12;
 }

 @Override
 public String getTaxDetails() {
     return "GST @ 12%";
 }
}
