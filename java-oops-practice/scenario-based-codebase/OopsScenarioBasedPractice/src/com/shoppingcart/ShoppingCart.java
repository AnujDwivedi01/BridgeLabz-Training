package com.shoppingcart;


class ShoppingCart {

 // Composition: CartItem objects exist only inside ShoppingCart
 private CartItem[] items = new CartItem[10];
 private int count = 0;

 // Method to add product to cart
 public void addToCart(Product product, int quantity) {
     items[count++] = new CartItem(product, quantity);
     System.out.println(product.getProductName() + " added to cart");
 }

 // Method to calculate total cart amount
 public double calculateTotal() {
     double total = 0;
     for (int i = 0; i < count; i++) {
         total += items[i].getItemTotal();
     }
     return total;
 }

 // Method to display cart details
 public void displayCart() {
     System.out.println("---- Shopping Cart ----");
     for (int i = 0; i < count; i++) {
         System.out.println(
             items[i].getProduct().getProductName() +
             " x " + items[i].getQuantity()
         );
     }
     System.out.println("Total Amount: " + calculateTotal());
 }
}

