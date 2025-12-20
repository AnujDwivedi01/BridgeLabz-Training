// java program to find smallest and largest among three elements

import java.util.Scanner;

public class SmallestAndLargest {
    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return result as array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Call method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display results
        System.out.println("Smallest number = " + result[0]);
        System.out.println("Largest number = " + result[1]);

        input.close();
    }

    
}
