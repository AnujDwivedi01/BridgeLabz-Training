// java program to split text conversion

import java.util.Scanner;

public class SplitTextComparison {

    // method to find string length without using length()
    public static int findStringLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    // method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {

        int length = findStringLength(text);

        // Step 1: Count number of words
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !isWord) {
                wordCount++;
                isWord = true;
            } else if (text.charAt(i) == ' ') {
                isWord = false;
            }
        }

        // Step 2: Store words in array
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        // Add last word
        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

    // method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // User-defined split
        String[] customWords = splitTextIntoWords(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean result = compareStringArrays(customWords, builtInWords);

        // Display words
        System.out.println("\nWords using user-defined method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison result with split(): " + result);

        input.close();
    }
}
