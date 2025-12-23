// Java program to find the first non-repeating character in  string

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        // array to store frequency of characters (ASCII)
        int[] frequency = new int[256];

        // loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // loop to find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        // return special character if no non-repeating characters
        return '\0';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a string: ");
        String text = input.next();

        // call method to find first non-repeating character
        char result = findFirstNonRepeatingChar(text);

        // display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("no non-repeating character found.");
        }
        input.close();
    }
}
