package com.bookbazzar;
// EBook with higher discount (no printing cost)
class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // 20% discount on EBooks
    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.20;
    }
}
