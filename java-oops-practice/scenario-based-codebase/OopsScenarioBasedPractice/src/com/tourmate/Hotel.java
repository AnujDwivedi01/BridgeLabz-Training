package com.tourmate;
class Hotel implements IBookable {
    private double cost;

    public Hotel(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void book() {
        System.out.println("Hotel booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Hotel booking cancelled.");
    }
}

// Activity class
class Activity implements IBookable {
    private double cost;

    public Activity(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void book() {
        System.out.println("Activities booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Activity booking cancelled.");
    }
}