package com.inheritance.singleinheritance.problem2;

public class SmartHomeApp {

    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat(
                "THERMO-101",
                true,
                24
        );

        thermostat.displayStatus();
    }
}
