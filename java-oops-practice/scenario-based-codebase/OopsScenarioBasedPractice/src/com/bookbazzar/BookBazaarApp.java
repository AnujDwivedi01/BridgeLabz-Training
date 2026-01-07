package com.bookbazzar;
public class BookBazaarApp {

    public static void main(String[] args) {

        // Inventory
        Book b1 = new EBook("Java Mastery", "James Gosling", 500, 10);
        Book b2 = new PrintedBook("Clean Code", "Robert Martin", 700, 5);

        b1.displayBook();
        b2.displayBook();

        // Create order
        Order order = new Order("Anuj");

        // Add books (polymorphism in discount calculation)
        order.addBook(b1, 2);
        order.addBook(b2, 3);

        order.confirmOrder();
        order.displayOrder();
    }
}
