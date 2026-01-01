package com.shoppingcart;


public class ShopApp {

 public static void main(String[] args) {

     // Creating product objects
     Product p1 = new Product("Laptop", 50000);
     Product p2 = new Product("Headphones", 3000);

     // Creating shopping cart
     ShoppingCart cart = new ShoppingCart();

     // Adding products to cart
     cart.addToCart(p1, 1);
     cart.addToCart(p2, 2);

     // Display cart summary
     cart.displayCart();
 }
}

