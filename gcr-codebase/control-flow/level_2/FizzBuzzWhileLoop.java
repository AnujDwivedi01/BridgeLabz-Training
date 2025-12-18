//Write a program FizzBuzz by while loop 
import java.util.Scanner;

public class FizzBuzzWhileLoop {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking for positive number
        if (number > 0) {

            // Initializing loop variable
            int i = 1;

            // While loop from 1 to number
            while (i <= number) {

                // Checking divisibility by 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                // Checking divisibility by 3
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                // Checking divisibility by 5
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                // Printing number if no condition matches
                } else {
                    System.out.println(i);
                }

                // Incrementing the loop variable
                i++;
            }
        } else {
            // Error message for invalid input
            System.out.println("Please enter a positive integer.");
        }

        // Closing Scanner
        input.close();
    }
}
