package com.libraryorganizer;

import java.util.Objects;

public class Book {
       // instance variable
	   private String title;
	   private String author;
	   
	   // constructor
	   public Book(String title, String author) {
		this.title = title;
		this.author = author;
	   }
	   
	   public String getTitle() {
		   return title;
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Book)) return false;
	        Book b = (Book) obj;
	        return title.equalsIgnoreCase(b.title) &&
	               author.equalsIgnoreCase(b.author);
	    }
	   
	   @Override
	    public int hashCode() {
	        return Objects.hash(title.toLowerCase(), author.toLowerCase());
	    }

	    @Override
	    public String toString() {
	        return title + " by " + author;
	    }
	   
	   
}
