package com.inheritance.singleinheritance.problem2;

class Thermostat extends Device {

    private int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID          : " + deviceId);
        System.out.println("Device Status      : " + (status ? "ON" : "OFF"));
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
