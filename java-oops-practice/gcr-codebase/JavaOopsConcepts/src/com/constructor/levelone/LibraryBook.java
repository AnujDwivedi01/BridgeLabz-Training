package com.constructor.levelone;

public class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    // Display book info
    public void displayBook() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
        System.out.println("Available  : " + available);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Clean Code", "Robert C. Martin", 599);

        book.displayBook();
        book.borrowBook();
        book.borrowBook();
    }
}

