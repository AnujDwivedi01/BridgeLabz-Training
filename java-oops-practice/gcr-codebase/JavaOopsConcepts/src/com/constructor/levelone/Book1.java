package com.constructor.levelone;

//Base class Book1
public class Book1 {

 // Public variable - accessible everywhere
 public String ISBN;

 // Protected variable - accessible in subclass
 protected String title;

 // Private variable - accessible only inside this class
 private String author;

 // Constructor
 public Book1(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Setter for author
 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter for author
 public String getAuthor() {
     return author;
 }
}

