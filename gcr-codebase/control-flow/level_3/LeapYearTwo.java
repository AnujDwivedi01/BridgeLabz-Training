// Java Program for Gregorian calendar with single if condition

import java.util.Scanner;

public class LeapYearTwo {

    public static void main(String[] args) {

        // Create Scanner object with reference name "input"
        Scanner input = new Scanner(System.in);

        // Take year input from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if year is valid (Gregorian calendar)
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        }
        // Single if condition using logical AND (&&) and OR (||)
        else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year is a Leap Year");
        }
        else {
            System.out.println("Year is not a Leap Year");
        }

        // Close scanner
        input.close();
    }
}
