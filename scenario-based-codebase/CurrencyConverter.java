/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
		
		// to repeat process
        String anotherConversion; 

        do {
            // Take amount in INR
            System.out.print("\nEnter amount in INR: ");
            double amount = input.nextDouble();

            // Show currency options
            System.out.println("\nChoose Target Currency:");
            System.out.println("1 - USD");
            System.out.println("2 - EUR");
            System.out.println("3 - GBP");
            System.out.println("4 - JPY");

            int option = input.nextInt();
            double convertedAmount = 0;

            // Switch case for currency conversion
            switch (option) {
                case 1:
                    double usdRate = 0.012;
                    convertedAmount = amount * usdRate;
                    System.out.println("Converted Amount in USD: " + convertedAmount);
                    break;

                case 2:
                    double eurRate = 0.011;
                    convertedAmount = amount * eurRate;
                    System.out.println("Converted Amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    double gbpRate = 0.010;
                    convertedAmount = amount * gbpRate;
                    System.out.println("Converted Amount in GBP: " + convertedAmount);
                    break;

                case 4:
                    double jpyRate = 1.80;
                    convertedAmount = amount * jpyRate;
                    System.out.println("Converted Amount in JPY: " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency option!");
            }

            // Ask user if they want another conversion
            System.out.print("\nDo you want another conversion? (yes/no): ");
            anotherConversion = input.next().toLowerCase();

        } while (anotherConversion.equals("yes"));

        System.out.println("\nThank you for using Currency Converter!");
        input.close();
    }
}
