// java program to compare sum of natural numbers
import java.util.Scanner;

public class SumOfNaturalNumbersComparison {
	    // Method to find sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum of n natural numbers using formula
    public static int sumUsingFormula(int n) {

        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Validate natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        // Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Calculate sum using formula
        int formulaSum = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion = " + recursiveSum);
        System.out.println("Sum using formula   = " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("Results do not match.");
        }

        input.close();
    }


}
