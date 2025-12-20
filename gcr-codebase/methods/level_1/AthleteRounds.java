//java program to count athelete round

import java.util.Scanner;

public class AthleteRounds {
	
	  // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {

        // Perimeter of triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate number of rounds
        return Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for the three sides of the triangle (in meters)
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Call method to calculate number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Number of rounds required to complete 5 km = " + rounds);

        input.close();
    }

  
}