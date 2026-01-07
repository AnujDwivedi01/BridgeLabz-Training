package com.bookbazzar;
// Printed book with lower discount
class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Flat ₹50 discount if more than 2 books
    @Override
    public double applyDiscount(int quantity) {
        return quantity > 2 ? 50 : 0;
    }
}
