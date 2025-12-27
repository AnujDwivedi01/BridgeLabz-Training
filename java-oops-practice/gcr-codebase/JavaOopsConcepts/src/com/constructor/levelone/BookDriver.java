package com.constructor.levelone;

public class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "James Gosling", 499.99);

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
