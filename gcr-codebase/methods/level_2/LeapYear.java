// java program to check leap year

import java.util.Scanner;

public class LeapYear {
    // Method to check for leap year
    public static boolean isLeapYear(int year) {

        // checking both conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take year input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // checking Gregorian calendar year
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
            return;
        }

        // Calling


		method to check leap year
        boolean isLeap = isLeapYear(year);

        // Display result
        if (isLeap) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        input.close();
    }

    
}
