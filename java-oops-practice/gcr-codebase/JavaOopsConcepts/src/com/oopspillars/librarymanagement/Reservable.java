package com.oopspillars.librarymanagement;

//Interface defining reservation-related behavior
interface Reservable {

	void reserveItem(String borrowerName);

	boolean checkAvailability();
}
