// java program fir number format exception

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // method to generate NumberFormatException
    public static void generateException(String text) {

        // this will throw NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    // method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take user input as String
        System.out.print("Enter a value: ");
        String text = input.next();

        // call method to generate exception
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated in generateException() method.");
        }

        // call method to handle exception
        handleException(text);

        input.close();
    }
}
