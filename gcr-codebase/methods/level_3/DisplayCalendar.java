// java Program to display calendar for a given month and year

import java.util.Scanner;

public class DisplayCalendar {

    // Array to store month names
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store number of days in each month
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read month and year from user
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Display calendar
        printCalendar(month, year);

        input.close();
    }

    // Method to print the calendar
    private static void printCalendar(int month, int year) {

        // Print month and year header
        System.out.println("\n  " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get first day of the month (0 = Sunday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Get number of days in the month
        int days = getNumberOfDays(month, year);

        // First for-loop → indentation before day 1
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second for-loop → print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Method to get month name
    private static String getMonthName(int month) {
        return MONTH_NAMES[month - 1];
    }

    // Method to get number of days in month
    private static int getNumberOfDays(int month, int year) {

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to check leap year
    private static boolean isLeapYear(int year) {

        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    // Method to calculate first day using Gregorian algorithm
    // Returns: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    private static int getFirstDayOfMonth(int month, int year) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }
}
