// Java Program for Power of a number using for loop

import java.util.Scanner;

public class PowerOfNumberForLoop {

    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Taking power input
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initializing result variable
        int result = 1;

        // Checking for positive integers
        if (number > 0 && power >= 0) {

            // Loop from 1 to power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Printing the result
            System.out.println("Result: " + result);

        } else {
            System.out.println("Please enter positive integers.");
        }

        // Closing Scanner
        input.close();
    }
}
