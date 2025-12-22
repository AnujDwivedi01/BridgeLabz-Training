// java program for trim string comparison

import java.util.Scanner;

public class TrimStringComparison {

    // method to find start and end index without leading/trailing spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

      
        for (int i = 0; ; i++) {
            try {
                text.charAt(i);
                end = i;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        // trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        int i = 0;

        while (true) {
            try {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        // check both ended at same time
        try {
            s2.charAt(i);
            return false;
        } catch (StringIndexOutOfBoundsException e) {
            return true;
        }
    }

    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text with leading and trailing spaces:");
        String text = input.nextLine();

        // User-defined trim logic
        int[] indexes = findTrimIndexes(text);
        String trimmedText = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim()
        String builtInTrim = text.trim();

        // Compare both results
        boolean isSame = compareStrings(trimmedText, builtInTrim);

        System.out.println("\nTrimmed Text (User Method): [" + trimmedText + "]");
        System.out.println("Trimmed Text (Built-in):   [" + builtInTrim + "]");
        System.out.println("Both results are same: " + isSame);

        input.close();
    }
}
