// Java Program for Multiples below hundred by While loop

import java.util.Scanner;

public class MultiplesBelowHundredWhileLoop {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if number is positive and less than 100
        if (number > 0 && number < 100) {

            // Initializing counter
            int counter = 100;

            // While loop till counter is greater than 1
            while (counter > 1) {

                // Checking if counter is divisible by number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                // Decrementing counter
                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        // Closing Scanner
        input.close();
    }
}
