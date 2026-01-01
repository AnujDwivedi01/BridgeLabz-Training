package com.oopspillars.vehiclerentalsystem;

//Main class
public class VehicleRentalApp {

 public static void main(String[] args) {

     // : Vehicle reference holding different objects
     Vehicle[] vehicles = {
         new Car("CAR-101", 1500, "CAR123456"),
         new Bike("BIKE-202", 500, "BIKE987654"),
         new Truck("TRUCK-303", 3000, "TRUCK456789")
     };

     int rentalDays = 3;

     // Iterate using Vehicle reference (Polymorphism)
     for (Vehicle v : vehicles) {

         System.out.println("Vehicle Type   : " + v.getType());
         System.out.println("Vehicle Number : " + v.getVehicleNumber());
         System.out.println("Rental Cost    : ₹" + v.calculateRentalCost(rentalDays));

         // Insurance details (interface check)
         if (v instanceof Insurable) {
             Insurable ins = (Insurable) v;
             System.out.println("Insurance Cost : ₹" + ins.calculateInsurance());
             System.out.println(ins.getInsuranceDetails());
         }

         System.out.println("--------------------------------");
     }
 }
}
