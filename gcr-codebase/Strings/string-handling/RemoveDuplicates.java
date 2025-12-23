import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicates
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (result.indexOf(text.charAt(i)) == -1)
                result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("Without Duplicates: " + removeDuplicates(text));
    }
}
