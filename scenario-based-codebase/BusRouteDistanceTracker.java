/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        double totalDistance = 0;
        double stopDistance;
        String choice = "no";

        // loop until passenger wants to get off
        while (choice.equals("no")) {

            // take distance of current stop
            System.out.print("Enter distance traveled for this stop (in km): ");
            stopDistance = input.nextDouble();

            // Add to total distance
            totalDistance += stopDistance;

            // Display total distance
            System.out.println("Total distance traveled: " + totalDistance + " km");

            // Ask if passenger wants to exit
            System.out.print("Do you want to get off? (yes/no): ");
            choice = input.next().toLowerCase();
        }

        System.out.println("\nPassenger exited.");
        System.out.println("Final Distance Travelled: " + totalDistance + " km");

        input.close();
    }
}
