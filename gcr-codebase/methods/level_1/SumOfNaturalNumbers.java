// java program for sum of n natural number

import java.util.Scanner;

public class SumOfNaturalNumbers {
      // Method to find sum of n natural numbers using loop
    public static int findSumOfNaturalNumbers(int n) {

        int sum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        // Call method to calculate sum
        int sum = findSumOfNaturalNumbers(n);

        // Display result
        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        input.close();
    }

  
}
