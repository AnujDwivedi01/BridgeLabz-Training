package com.oopspillars.librarymanagement;

//DVD item
class DVD extends LibraryItem {

	public DVD(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	// DVDs can be borrowed for 3 days
	@Override
	public int getLoanDuration() {
		return 3;
	}
}
