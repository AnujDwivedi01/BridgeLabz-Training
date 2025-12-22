// java program for vowel and consonant two

import java.util.Scanner;

public class VowelConsonantTwo {

    // method to check character type
    public static String checkCharacterType(char ch) {

        // convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // check if letter
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

    // Method to create 2D array [Character, Type]
    public static String[][] findCharacterTypes(String text) {

        int length = 0;

        // Find length without using length()
        for (int i = 0; ; i++) {
            try {
                text.charAt(i);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        String[][] result = findCharacterTypes(text);
        displayResult(result);

        input.close();
    }
}
