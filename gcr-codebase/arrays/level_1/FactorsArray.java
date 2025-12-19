// Java Program for factor storing in array

import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initial maximum size for factors array
        int maxFactor = 10;

        // Array to store factors
        int[] factors = new int[maxFactor];

        // Index to track number of factors stored
        int index = 0;

        // Loop from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {

            // Check if i is a factor
            if (number % i == 0) {

                // If array is full, resize it
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    // Create temporary array with new size
                    int[] temp = new int[maxFactor];

                    // Copy old elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign new array to factors
                    factors = temp;
                }

                // Store factor and increment index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
