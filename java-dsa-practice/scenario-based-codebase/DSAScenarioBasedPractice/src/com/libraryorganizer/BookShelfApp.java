package com.libraryorganizer;

public class BookShelfApp {
	public static void main(String[] args) {

		Library library = new Library();

		Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
		Book b2 = new Book("Harry Potter", "J.K. Rowling");
		Book b3 = new Book("Clean Code", "Robert Martin");

		library.addBook("Fantasy", b1);
		library.addBook("Fantasy", b2);
		library.addBook("Programming", b3);

		library.addBook("Fantasy", b1); // duplicate

		library.displayCatalog();

		library.borrowBook("Fantasy", b2);

		library.displayCatalog();
	}
}
