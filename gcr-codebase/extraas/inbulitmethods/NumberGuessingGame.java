// java program for number guessing game

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // method to generate a random guess between given range of numbers
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // method to get user feedback for the computer's guess
    public static String getUserFeedback(Scanner input) {
        System.out.print("Is the guess High, Low, or Correct? (h/l/c): ");
        return input.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // declearing and assigning variables
        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!isCorrect) {
            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            String feedback = getUserFeedback(input);

            if (feedback.equals("h")) {
                high = guess - 1; // Guess was too high
            } else if (feedback.equals("l")) {
                low = guess + 1; // Guess was too low
            } else if (feedback.equals("c")) {
                System.out.println("Yay! I guessed your number correctly");
                isCorrect = true;
            } else {
                System.out.println("Invalid input. Please enter h, l, or c.");
            }
        }

        input.close();
    }
}
