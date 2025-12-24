import java.util.Scanner;

public class StringCompare {

    public static int compareStrings(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = input.next();

        System.out.print("Enter second string: ");
        String s2 = input.next();

        int result = compareStrings(s1, s2);

        if (result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (result > 0)
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        else
            System.out.println("Both strings are equal");
    }
}
