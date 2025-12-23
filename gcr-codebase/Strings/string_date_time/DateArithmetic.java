// java program for airthmetic operations in date

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take date input from user in yyyy-MM-dd format
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(input.next());

        // add 7 days, 1 month, 2 years and subtract 3 weeks
        LocalDate result = date.plusDays(7)
                               .plusMonths(1)
                               .plusYears(2)
                               .minusWeeks(3);

        // display final calculated date
        System.out.println("Final Date after operations: " + result);
    }
}
