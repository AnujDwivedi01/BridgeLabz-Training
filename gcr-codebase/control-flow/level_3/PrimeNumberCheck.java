// Java Program for Prime Number Check 

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        // Create Scanner object with reference name "input"
        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean variable to store result
        boolean isPrime = true;

        // Prime number check is valid only for numbers greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to the given number
            for (int i = 2; i < number; i++) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop if divisible by another number
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Close scanner
        input.close();
    }
}
