/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/
import java.util.Scanner;

public class PhoneRecharge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean continueRecharge = true;

        while (continueRecharge) {

            // taking operator input
            System.out.println("\nChoose Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.print("Enter your choice: ");
            int operatorChoice = scanner.nextInt();
			
			// Enhanced switch to display offers
            switch (operatorChoice) {
                case 1 -> System.out.println("Jio Offer: 2GB/day + Unlimited Calls");
                case 2 -> System.out.println("Airtel Offer: 1.5GB/day + Free OTT");
                case 3 -> System.out.println("VI Offer: 1GB/day + Weekend Data RollOver");
                default -> System.out.println("Invalid Operator Selected");
            }

            // taking recharge amount
            System.out.print("Enter recharge amount: ₹");
            double amount = scanner.nextDouble();

            balance += amount;

            

            // Showing updated balance
            System.out.println("Recharge Successful!");
            System.out.println("Current Balance: " + balance);

            // Asking user to continue or exit
            System.out.print("\nDo you want to recharge again? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueRecharge = false;
            }
        }

       
        scanner.close();
    }
}
