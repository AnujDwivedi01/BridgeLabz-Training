import java.util.Scanner;

public class LongestWord {

    // Method to find longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Longest Word: " + findLongestWord(sentence));
    }
}
