import java.util.Scanner;

public class RemoveSpecificCharacter {
    // method to find specific character
    public static String removeChar(String text, char ch) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = input.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = input.next().charAt(0);

        System.out.println("Modified String: " + removeChar(text, ch));
    }
}
