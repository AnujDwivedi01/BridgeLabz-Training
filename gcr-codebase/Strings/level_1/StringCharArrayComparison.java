// Java Program for string character array comparison

import java.util.Scanner;

public class StringCharArrayComparison {

    // method to return characters of a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    // method to compare two char arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        // User-defined method
        char[] customArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(customArray, builtInArray);

        // Display result
        System.out.println("Characters using user-defined method:");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }

        System.out.println("\nComparison Result: " + result);

        input.close();
    }
}
