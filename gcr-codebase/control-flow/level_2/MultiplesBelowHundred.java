// Writting Java Program for Multiples of a number below 100

import java.util.Scanner;

public class MultiplesBelowHundred {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100:");

            // Loop running backward from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Checking if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        // Closing Scanner
        input.close();
    }
}
