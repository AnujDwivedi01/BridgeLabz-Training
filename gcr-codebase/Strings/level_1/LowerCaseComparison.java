// java program for lower case comparison

import java.util.Scanner;

public class LowerCaseComparison {

    // method to convert text to lowercase using ASCII logic and charAt()
    public static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
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
        String customLowerCase = convertToLowerCase(text);

        // convert using built-in method
        String builtInLowerCase = text.toLowerCase();

        // compare both results
        boolean isSame = compareStrings(customLowerCase, builtInLowerCase);

        // display results
        System.out.println("Custom Lowercase : " + customLowerCase);
        System.out.println("Built-in Lowercase: " + builtInLowerCase);
        System.out.println("Both results are same: " + isSame);

        input.close();
    }
}
