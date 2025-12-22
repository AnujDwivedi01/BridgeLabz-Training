// java program to compare two string

import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String first, String second) {

        // If lengths are different, strings are not equal
        if (first.length() != second.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  user input for two strings
        System.out.print("Enter first string: ");
        String firstString = input.next();

        System.out.print("Enter second string: ");
        String secondString = input.next();

        // Compare using charAt method
        boolean charAtResult = compareStringsUsingCharAt(firstString, secondString);

        // Compare using  equals() method
        boolean equalsResult = firstString.equals(secondString);

        // Display results
        System.out.println("Result using charAt() comparison: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);

        // Check if both results are same
        if (charAtResult == equalsResult) {
            System.out.println("Both comparison results are SAME.");
        } else {
            System.out.println("Comparison results are DIFFERENT.");
        }

        input.close();
    }
}
