// Factorial program by for loop

import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a natural number: ");
        int num = input.nextInt();

        // Check for natural number
        if (num <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            int factorial = 1;

            // Determine factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        input.close();
    }
}
