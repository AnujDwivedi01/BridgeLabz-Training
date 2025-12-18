// Adding program sum of natural numbers by for loop

import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            // Sum using for loop
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop  = " + sumFor);
            System.out.println("Sum using formula  = " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("✅ Both computations are correct.");
            } else {
                System.out.println("❌ Results do not match.");
            }
        }

        input.close();
    }
}
