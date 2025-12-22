// java program to string length count

import java.util.Scanner;

public class StringLength {

    // method to find length of string without using length()
    public static int findStringLength(String text) {

        int count = 0;

        // infinite loop to count characters
        while (true) {
            try {
                text.charAt(count); 
                count++;            
            } catch (StringIndexOutOfBoundsException e) {
                // Exception occurs when index goes out of bounds
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        // User-defined method
        int customLength = findStringLength(text);

        // Built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);

        input.close();
    }
}
