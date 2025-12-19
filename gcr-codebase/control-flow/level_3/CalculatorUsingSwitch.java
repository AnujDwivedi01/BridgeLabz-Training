// Java Program for Calculator Using Switch

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get first number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        // Get second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        // Variable to store result
        double result;

        // Perform operation using switch-case
        switch (op) {

            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        // Close scanner
        input.close();
    }
}
