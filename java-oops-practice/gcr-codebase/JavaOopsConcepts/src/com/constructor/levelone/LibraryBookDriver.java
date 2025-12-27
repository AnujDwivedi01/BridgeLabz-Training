package com.constructor.levelone;

public class LibraryBookDriver {
	public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Clean Code", "Robert C. Martin", 599);

        book.displayBook();
        book.borrowBook();
        book.borrowBook();
    }

}
