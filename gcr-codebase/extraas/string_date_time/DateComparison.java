// java program for date comprasion\

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take first date input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(input.next());

        // take second date input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(input.next());

        // compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } 
        else {
            System.out.println("Both dates are SAME");
        }
    }
}
