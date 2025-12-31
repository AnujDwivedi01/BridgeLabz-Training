package com.inheritance.singleinheritance.problem1;

class Author extends Book {

	 private String name;
	 private String bio;

	 // Constructor
	 public Author(String title, int publicationYear, String name, String bio) {
	     super(title, publicationYear); // Call superclass constructor
	     this.name = name;
	     this.bio = bio;
	 }

	 // Method to display book and author details
	 public void displayInfo() {
	     System.out.println("Book Title       : " + title);
	     System.out.println("Publication Year : " + publicationYear);
	     System.out.println("Author Name      : " + name);
	     System.out.println("Author Bio       : " + bio);
	 }
	}
