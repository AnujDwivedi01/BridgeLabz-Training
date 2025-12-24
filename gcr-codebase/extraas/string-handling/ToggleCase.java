import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                result += (char) (ch + 32);
            else if (ch >= 'a' && ch <= 'z')
                result += (char) (ch - 32);
            else
                result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("Toggled Case: " + toggleCase(text));
    }
}
