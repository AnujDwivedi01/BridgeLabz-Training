import java.util.Scanner;

public class MostFrequentCharacter {
    // method to find most requent character
    public static char mostFrequent(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char maxChar = text.charAt(0);
        int max = 0;

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                maxChar = text.charAt(i);
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = input.nextLine();

        System.out.println("Most Frequent Character: " + mostFrequent(text));
    }
}
