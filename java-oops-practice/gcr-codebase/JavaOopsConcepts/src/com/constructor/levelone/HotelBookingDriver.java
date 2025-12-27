package com.constructor.levelone;

public class HotelBookingDriver {
	 public static void main(String[] args) {
	        HotelBooking b1 = new HotelBooking();
	        HotelBooking b2 = new HotelBooking("Ravi", "Deluxe", 3);
	        HotelBooking b3 = new HotelBooking(b2);

	        b1.displayBooking();
	        System.out.println();
	        b2.displayBooking();
	        System.out.println();
	        b3.displayBooking();
	    }

}
