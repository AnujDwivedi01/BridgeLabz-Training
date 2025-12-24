import java.util.Scanner;

public class ReverseString {

    // method to reverse a string
    public static String reverse(String text) {
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("Reversed String: " + reverse(text));
    }
}
