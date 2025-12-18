// Writting Factors of a Number Program by While loop

import java.util.Scanner;

public class FactorsOfNumberWhileLoop {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the number is a positive integer
        if (number > 0) {

            // Initializing loop variable
            int i = 1;

            // Running while loop from 1 to less than number
            while (i < number) {

                // Checking if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }

                // Incrementing loop variable
                i++;
            }

        } else {
            // Message for invalid input
            System.out.println("Please enter a positive integer.");
        }

        // Closing the Scanner
        input.close();
    }
}
