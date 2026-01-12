package com.ambulanceroute;
public class AmbulanceRouteDemo {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        // Adding hospital units
        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        // Ambulance searching for available unit
        route.findAvailableUnit();

        // Remove unit under maintenance
        route.removeUnit("Radiology");

        route.displayUnits();

        // Try again after removal
        route.findAvailableUnit();
    }
}