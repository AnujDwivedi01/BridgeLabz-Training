// java program for maximumof three numbers

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // method to take input from user
    public static int takeInput(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }

    // method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		
		// taking input by the function
        int num1 = takeInput(input, "Enter first number: ");
        int num2 = takeInput(input, "Enter second number: ");
        int num3 = takeInput(input, "Enter third number: ");

        int maximum = findMaximum(num1, num2, num3);

        System.out.println("Maximum of the three numbers is: " + maximum);

        input.close();
    }
}
