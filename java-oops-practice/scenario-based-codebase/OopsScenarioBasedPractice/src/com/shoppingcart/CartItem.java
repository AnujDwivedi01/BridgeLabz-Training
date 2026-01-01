package com.shoppingcart;


class CartItem {

 private Product product;
 private int quantity;

 // Constructor to initialize cart item
 public CartItem(Product product, int quantity) {
     this.product = product;
     this.quantity = quantity;
 }

 // Calculate total price for this cart item
 public double getItemTotal() {
     return product.getPrice() * quantity;
 }

 public Product getProduct() {
     return product;
 }

 public int getQuantity() {
     return quantity;
 }
}

