// Writting Factors of a Number Program

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Asking user for a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if number is positive
        if (number > 0) {

            // Displaying factors
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {

                // Checking if number is divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            // Error message
            System.out.println("Please enter a positive integer.");
        }

        // Closing Scanner
        input.close();
    }
}
