// java program to find Quotient And Remainder

import java.util.Scanner;

public class QuotientAndRemainder {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Validate divisor
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
            return;
        }

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        input.close();
    }

    
}
