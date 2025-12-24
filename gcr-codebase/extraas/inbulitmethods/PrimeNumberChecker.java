// java program to check a prime number

import java.util.Scanner;

public class PrimeNumberChecker {

    // method to check whether a number is prime or not
    public static boolean isPrime(int number) {

        // numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // calling method and printing result
        System.out.print("Enter a number to check if it is prime: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        input.close();
    }
}
