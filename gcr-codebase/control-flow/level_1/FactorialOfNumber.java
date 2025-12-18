// Writting a program to find factorial of a number

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Check if the number is positive
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        input.close();
    }
}
