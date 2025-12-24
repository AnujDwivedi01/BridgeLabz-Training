// java program for finding factorial using recurssion

import java.util.Scanner;

public class FactorialRecursion {

    // recursive method to calculate factorial of a number
    public static long factorial(int number) {

        
        if (number == 0 || number == 1) {
            return 1;
        }

        // recursive call
        return number * factorial(number - 1);
    }

    // method to display result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
         
		 
		// calling method and printing result
		 
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }

        input.close();
    }
}
