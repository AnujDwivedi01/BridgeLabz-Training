// java program for gcd and lcm calculate

import java.util.Scanner;

public class GcdLcmCalculator {

    // method to calculate GCD using Euclidean Algorithm for calculation
    public static int calculateGCD(int a, int b) {

        // Ensure positive values
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }

    // method to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {

        // LCM formula: (a * b) / GCD(a, b)
        return (a * b) / calculateGCD(a, b);
    }

    // Method to display the result
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("First Number : " + a);
        System.out.println("Second Number: " + b);
        System.out.println("GCD           : " + gcd);
        System.out.println("LCM           : " + lcm);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking user input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Validating  input
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int gcd = calculateGCD(num1, num2);
            int lcm = calculateLCM(num1, num2);

            displayResult(num1, num2, gcd, lcm);
        }

        input.close();
    }
}
