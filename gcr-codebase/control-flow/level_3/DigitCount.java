// java Program for Digit Count 

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store count of digits
        int count = 0;

        // Loop until number becomes 0
        while (number != 0) {

            // Remove last digit
            number = number / 10;

            // Increase digit count
            count++;
        }

        // Display result
        System.out.println("Number of digits: " + count);

        // Close scanner
        input.close();
    }
}
