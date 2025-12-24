// java program to generate fibonacci series

import java.util.Scanner;

public class FibonacciSequence  {

    // method to generate and print Fibonacci sequence  of a number
    public static void generateFibonacci(int terms) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();
		
        // calling method and printing result
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(terms);
        }

        input.close();
    }
}
