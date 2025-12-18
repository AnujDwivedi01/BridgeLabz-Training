//11
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        while (true) {
            // Take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // Check for stop condition
            if (number <= 0) {
                break;
            }

            // Add to total
            total += number;
        }

        // Display total
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
