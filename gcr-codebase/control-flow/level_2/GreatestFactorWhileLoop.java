// Writting Greatest Factor Program using While loop

import java.util.Scanner;

public class GreatestFactorWhileLoop {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initializing greatestFactor with 1
        int greatestFactor = 1;

        // Checking for positive number
        if (number > 0) {

            // Initializing counter variable
            int counter = number - 1;

            // While loop till counter reaches 1
            while (counter >= 1) {

                // Checking divisibility
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // Exit loop
                }

                // Decrementing counter
                counter--;
            }

            // Displaying the result
            System.out.println("Greatest factor beside itself: " + greatestFactor);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing Scanner
        input.close();
    }
}
