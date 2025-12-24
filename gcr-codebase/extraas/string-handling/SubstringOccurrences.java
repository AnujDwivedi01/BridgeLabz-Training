import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            int j = 0;
            while (j < sub.length() && text.charAt(i + j) == sub.charAt(j)) {
                j++;
            }
            if (j == sub.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = input.nextLine();

        System.out.print("Enter substring: ");
        String sub = input.nextLine();

        System.out.println("Occurrences: " + countOccurrences(text, sub));
    }
}
