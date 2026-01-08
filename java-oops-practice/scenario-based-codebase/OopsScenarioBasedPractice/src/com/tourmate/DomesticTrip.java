package com.tourmate;
class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    // Polymorphism
    @Override
    public void bookTrip() {
        System.out.println("Booking Domestic Trip...");
        super.bookTrip();
    }
}
