// Java Program for Armstrong Number

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number for comparison
        int originalNumber = number;

        // Variable to store sum of cubes of digits
        int sum = 0;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Get last digit using modulus
            int digit = originalNumber % 10;

            // Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Check if sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        // Close scanner
        input.close();
    }
}
