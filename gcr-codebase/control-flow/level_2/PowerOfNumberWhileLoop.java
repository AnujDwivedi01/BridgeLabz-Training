// Java Program for Power of a number by While loop

import java.util.Scanner;

public class PowerOfNumberWhileLoop {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Taking power input
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initializing result variable
        int result = 1;

        // Initializing counter variable
        int counter = 0;

        // Checking for positive integers
        if (number > 0 && power >= 0) {

            // While loop till counter equals power
            while (counter < power) {

                // Multiplying result with number
                result = result * number;

                // Incrementing counter
                counter++;
            }

            // Printing final result
            System.out.println("Result: " + result);

        } else {
            System.out.println("Please enter positive integers.");
        }

        // Closing Scanner
        input.close();
    }
}
