package com.tourmate;
class Trip {
    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor to generate complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operator usage for total budget
        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public void showTripDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: ₹" + budget);
    }

    public void bookTrip() {
        transport.book();
        hotel.book();
        activity.book();
    }
}