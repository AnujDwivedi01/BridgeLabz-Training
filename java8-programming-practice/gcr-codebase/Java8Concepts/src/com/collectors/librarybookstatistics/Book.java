package com.collectors.librarybookstatistics;

class Book {
	String title;
	String genre;
	int pages;

	Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	String getGenre() {
		return genre;
	}

	int getPages() {
		return pages;
	}
}