// Writting Youngest and Tallest Friend Program

import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking Amar's age and height
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();

        // Taking Akbar's age and height
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();

        // Taking Anthony's age and height
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        // Finding the youngest age
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        // Checking who is the youngest
        if (youngestAge == amarAge) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Finding the tallest height
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        // Checking who is the tallest
        if (tallestHeight == amarHeight) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        // Closing Scanner
        input.close();
    }
}
