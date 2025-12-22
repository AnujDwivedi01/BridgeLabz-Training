// java program to check string index out of bound exception

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond the string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Accessing index beyond the string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Call method to generate exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException() method.");
        }

        // Call method to handle exception
        handleException(text);

        input.close();
    }
}
