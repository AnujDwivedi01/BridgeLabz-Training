package com.oopspillars.librarymanagement;

//Magazine item
class Magazine extends LibraryItem {

 public Magazine(int itemId, String title, String author) {
     super(itemId, title, author);
 }

 // Magazines can be borrowed for 7 days
 @Override
 public int getLoanDuration() {
     return 7;
 }
}
