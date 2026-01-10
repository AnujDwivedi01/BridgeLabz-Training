package com.libraryorganizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Library {
	 private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
	    private HashSet<Book> bookSet = new HashSet<>(); // avoid duplicates

	    // Add book
	    public void addBook(String genre, Book book) {
	        if (bookSet.contains(book)) {
	            System.out.println("Duplicate book not allowed: " + book);
	            return;
	        }

	        catalog.putIfAbsent(genre, new LinkedList<>());
	        catalog.get(genre).add(book);
	        bookSet.add(book);
	        System.out.println("Book added: " + book);
	    }

	    // Borrow (remove) book
	    public void borrowBook(String genre, Book book) {
	        LinkedList<Book> list = catalog.get(genre);
	        if (list != null && list.remove(book)) {
	            bookSet.remove(book);
	            System.out.println("Book borrowed: " + book);
	        } else {
	            System.out.println("Book not found.");
	        }
	    }

	    // Display catalog
	    public void displayCatalog() {
	        System.out.println("\nLibrary Catalog:");
	        for (String genre : catalog.keySet()) {
	            System.out.println("Genre: " + genre);
	            for (Book book : catalog.get(genre)) {
	                System.out.println("  - " + book);
	            }
	        }
	    }
}
