//Write a program FizzBuzz 

import java.util.Scanner;

public class FizzBuzzForLoop {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the number is positive
        if (number > 0) {

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // If number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                // If number is divisible by 3
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                // If number is divisible by 5
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                // If number is not divisible by 3 or 5
                } else {
                    System.out.println(i);
                }
            }
        } else {
            // Message if input is not a positive integer
            System.out.println("Please enter a positive integer.");
        }

        // Closing the Scanner
        input.close();
    }
}
