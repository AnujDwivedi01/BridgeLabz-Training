/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names
*/
import java.util.Scanner;
public class MovieTicketBooking{
       public static void main(String[] args){
		   Scanner input = new Scanner(System.in);
		   
		   //for loop iteration
		   char continueBooking = 'y';
		   
		   System.out.println("Welcome to Movie ticket booking app");
		   
		   // loop for multiple customers
		   do{
			int ticketPrice = 0;
            int snackPrice = 0;

            // movie selection
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Horror");
            System.out.print("Enter choice: ");
            int movieType = input.nextInt();
			
			// switch for movie type
			switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    System.out.println("Action movie selected");
                    break;
                case 2:
                    ticketPrice = 180;
                    System.out.println("Comedy movie selected");
                    break;
                case 3:
                    ticketPrice = 220;
                    System.out.println("Horror movie selected");
                    break;
                default:
                    System.out.println("Invalid movie choice");
                    continue;
            }
			
			 // Seat selection
            System.out.println("\nSelect Seat Type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            System.out.print("Enter choice: ");
            int seatType = input.nextInt();
			
			
			 // if for seat type
            if (seatType == 1) {
                ticketPrice += 100;
                System.out.println("Gold seat selected");
            } else if (seatType == 2) {
                ticketPrice += 50;
                System.out.println("Silver seat selected");
            } else {
                System.out.println("Invalid seat type");
                continue;
            }
			
			
            // snacks option
            System.out.print("\nDo you want snacks? (yes/no): ");
            String snackChoice = input.next();

            if (snackChoice.equalsIgnoreCase("yes")) {
                snackPrice = 80;
                System.out.println("Snacks added");
            } else {
                System.out.println("No snacks selected");
            }
			
			
			// total bill
            int totalAmount = ticketPrice + snackPrice;

            System.out.println("\n Booking Summary");
            System.out.println("Ticket Price : " + ticketPrice);
            System.out.println("Snack Price  : " + snackPrice);
            System.out.println("Total Amount : " + totalAmount);

            // continue booking 
            System.out.print("\nBook tickets for next customer? (y/n): ");
            continueBooking = input.next().charAt(0);			
			
			
	    }while(continueBooking == 'y' || continueBooking == 'Y');
		  

           // closing input

          input.close();		   
	   }
	   
}