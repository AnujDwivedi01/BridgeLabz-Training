// Writting Greatest Factor Program using for loop

import java.util.Scanner;

public class GreatestFactorForLoop {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initializing greatestFactor with 1
        int greatestFactor = 1;

        // Checking if number is positive
        if (number > 0) {

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {

                // Checking if number is divisible by i
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Exit loop after finding greatest factor
                }
            }

            // Displaying the greatest factor
            System.out.println("Greatest factor beside itself: " + greatestFactor);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing Scanner
        input.close();
    }
}
