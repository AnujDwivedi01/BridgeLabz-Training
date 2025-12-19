// Java Program for Harshad Number

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number
        int originalNumber = number;

        // Variable to store sum of digits
        int sum = 0;

        // While loop to extract each digit
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove last digit
            number = number / 10;
        }

        // Check if original number is divisible by sum
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        // Close scanner
        input.close();
    }
}
