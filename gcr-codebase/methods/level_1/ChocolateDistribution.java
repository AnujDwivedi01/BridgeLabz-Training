// java program for chocolates distribution

import java.util.Scanner;

public class ChocolateDistribution {
     // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate input
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        // Call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display result
        System.out.println("Each child gets = " + result[0] + " chocolates");
        System.out.println("Remaining chocolates = " + result[1]);

        input.close();
    }

   
}
