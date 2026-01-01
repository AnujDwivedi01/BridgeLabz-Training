package com.oopspillars.ecommerceplatform;

//Electronics product - taxable
class Electronics extends Product implements Taxable {

 public Electronics(int productId, String name, double price) {
     super(productId, name, price);
 }

 // 10% discount on electronics
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.10;
 }

 // 18% tax
 @Override
 public double calculateTax() {
     return getPrice() * 0.18;
 }

 @Override
 public String getTaxDetails() {
     return "GST @ 18%";
 }
}

