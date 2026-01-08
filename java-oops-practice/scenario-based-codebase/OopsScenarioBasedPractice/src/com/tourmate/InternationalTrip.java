package com.tourmate;
class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    // Polymorphism
    @Override
    public void bookTrip() {
        System.out.println("Booking International Trip (Passport & Visa Required)...");
        super.bookTrip();
    }
}