/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/


import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {

            // Take number from user
            System.out.print("Enter your lucky number: ");
            int number = input.nextInt();

            // Validate input
            if (number <= 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue; // skip this round
            }

            // Check winning condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Sorry, better luck next time!");
            }

            // Ask for another visitor
            System.out.print("\nIs there another visitor? (yes/no): ");
            choice = input.next().toLowerCase();
        }

        System.out.println("\nThank you for participating in the Diwali Lucky Draw! ");
        input.close();
    }
}
