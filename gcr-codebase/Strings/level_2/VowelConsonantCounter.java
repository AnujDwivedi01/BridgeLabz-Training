// java program to count vowel and consonants

import java.util.Scanner;

public class VowelConsonantCounter {

    // method to check character type
    
    public static String checkCharacter(char ch) {

        // convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

    //method to count vowels and consonants
    
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String result = checkCharacter(ch);

                if (result.equals("Vowel")) {
                    vowels++;
                } else if (result.equals("Consonant")) {
                    consonants++;
                }

            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

  
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        int[] result = countVowelsAndConsonants(text);

        System.out.println("\nVowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);

        input.close();
    }
}
