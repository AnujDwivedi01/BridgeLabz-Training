package com.inheritance.hybridinheritance.problem2;

public class VehicleApp {

    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 260);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 200);

        ev.charge();
        pv.refuel();
    }
}
