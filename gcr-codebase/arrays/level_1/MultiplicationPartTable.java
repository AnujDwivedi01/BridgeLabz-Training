import java.util.Scanner;

// Java Program for Multiplication for 4 values

public class MultiplicationPartTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results (for 6 to 9)
        int[] multiplicationResult = new int[4];

        // Calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        System.out.println("Multiplication Table:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
