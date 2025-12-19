// Java Program for Abundant Number

import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store sum of divisors
        int sum = 0;

        // Loop to find all divisors except the number itself
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        // Close scanner
        input.close();
    }
}
