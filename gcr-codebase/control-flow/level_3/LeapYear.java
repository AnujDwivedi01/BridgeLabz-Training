// Java Program for Gregorian calendar condition

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take year input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

       
       

        // Check for Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }

     

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else if (year >= 1582) {
            System.out.println("Year is not a Leap Year");
        }
		else {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        }

        // Close scanner
        input.close();
    }
}
