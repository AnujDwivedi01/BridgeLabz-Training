// java program for uppercase comparison

import java.util.Scanner;

public class UpperCaseComparison {

    // method to convert text to uppercase using ASCII logic and charAt()
    public static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }

            result = result + ch;
        }

        return result;
    }

    // method to compare two strings using charAt()
    public static boolean compareStrings(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // convert using user-defined method
        String customUpperCase = convertToUpperCase(text);

        // convert using built-in method
        String builtInUpperCase = text.toUpperCase();

        // compare both results
        boolean isSame = compareStrings(customUpperCase, builtInUpperCase);

        // display results
        System.out.println("Custom Uppercase : " + customUpperCase);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("Both results are same: " + isSame);

        input.close();
    }
}
