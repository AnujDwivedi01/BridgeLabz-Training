// Java program for illegal argument exception

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // method to generate IllegalArgumentException
    public static void generateException(String text) {

        // start index is greater than end index this will throw IllegalArgumentException
    
        System.out.println(text.substring(5, 2));
    }

    // method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // start index is greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        // call method to generate exception
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated in generateException() method.");
        }

        // call method to handle exception
        handleException(text);

        input.close();
    }
}
