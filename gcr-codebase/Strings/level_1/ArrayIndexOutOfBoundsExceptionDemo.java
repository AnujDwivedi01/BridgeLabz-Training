// java program for array index out of bound exception

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // accessing index greater than array length
        System.out.println(names[names.length]);
    }

    // method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            // Accessing index greater than array length
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter number of names: ");
        int size = input.nextInt();

        String[] names = new String[size];

        // take array elements input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        // call method to generate exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException() method.");
        }

        // call method to handle exception
        handleException(names);

        input.close();
    }
}
