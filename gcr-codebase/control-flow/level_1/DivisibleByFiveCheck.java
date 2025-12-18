import java.util.Scanner;

public class DivisibleByFiveCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Read input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisibleByFive = (number % 5 == 0);

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

        // Close the scanner
        scanner.close();
    }
}
