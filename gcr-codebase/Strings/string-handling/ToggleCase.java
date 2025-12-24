// java program to check toggle Case
import java.util.Scanner;

public class ToggleCase {

    static String toggleCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // Lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = input.nextLine();

        System.out.println("Toggled String: " + toggleCase(text));
    }
}
