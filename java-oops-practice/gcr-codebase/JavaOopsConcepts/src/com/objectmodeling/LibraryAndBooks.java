package com.objectmodeling;

import java.util.ArrayList;

 class Book {

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}



class Library {

	private String libraryName;
	private ArrayList<Book> books; // Aggregation

	// Constructor
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new ArrayList<>();
	}

	// Add book to library
	public void addBook(Book book) {
		books.add(book);
	}

	// Display books in the library
	public void displayBooks() {
		System.out.println("\nLibrary: " + libraryName);
		for (Book book : books) {
			book.displayBook();
		}
	}
}

public class LibraryAndBooks {

	public static void main(String[] args) {

		// Creating Book objects (independent of Library)
		Book b1 = new Book("Java Basics", "Anuj Dwivedi");
		Book b2 = new Book("Spring Boot", "Anupam Shukla");
		Book b3 = new Book("Data Structures", "Vikash Prajapati");

		// Creating Library objects
		Library cityLibrary = new Library("City Library");
		Library collegeLibrary = new Library("College Library");

		// Adding books to libraries
		cityLibrary.addBook(b1);
		cityLibrary.addBook(b2);

		collegeLibrary.addBook(b2); // Same book in another library
		collegeLibrary.addBook(b3);

		// Display books in each library
		cityLibrary.displayBooks();
		collegeLibrary.displayBooks();
	}
}
