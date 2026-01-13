package com.homenest;
public class HomeNestApp {

    public static void main(String[] args) {

        Device[] devices = {
            new Light("L101"),
            new Camera("C201"),
            new Thermostat("T301"),
            new Lock("K401")
        };

        for (Device device : devices) {
            device.turnOn();
            device.reset();   // polymorphism
            System.out.println("Energy Used (2 hrs): "
                    + device.calculateEnergy(2));
            System.out.println();
        }
    }
}
