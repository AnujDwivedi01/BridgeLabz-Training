package com.tourmate;

public class TourMate {
	public static void main(String[] args) {

		Transport transport = new Transport(15000);
		Hotel hotel = new Hotel(20000);
		Activity activity = new Activity(5000);

		Trip domestic = new DomesticTrip("Goa", 5, transport, hotel, activity);
		domestic.showTripDetails();
		domestic.bookTrip();

		System.out.println();

		Trip international = new InternationalTrip("Paris", 7, new Transport(60000), new Hotel(50000),
				new Activity(20000));
		international.showTripDetails();
		international.bookTrip();
	}
}