/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/
import java.util.Scanner;
public class TrainReservation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//total seats
		int totalSeats = 5;
		//user choice
		int choice;
		
		//using while loop for multiple swithces
		while(true){
			System.out.println("\n--- MENU ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
			
			choice = input.nextInt();
			
			// using enhanced switch
			switch(choice){
				// writting multiple cases
				
				case 1 -> {
					  if(totalSeats > 0){
						  totalSeats--;
						  System.out.println("Ticket Booked Succesfully");
						  System.out.println("Remaining Seats : "+ totalSeats);
						  
						  if(totalSeats == 0){
							   System.out.println("All seats are booked!!!");
							   break;
						  }  
					  }
					  else{
						 System.out.println(" No seats available.");
                         break;
					  }
				}
				
				case 2 -> {
					  if(totalSeats>0){
						  System.out.println("Remaning Seats : " + totalSeats);              
					  }
					  else{
						  System.out.println("No Seats Avilabel");						  
					  }
				}
				
				case 3 -> {
					System.out.println(" Exiting reservation system. Thank you!");
					return;
				}
				
				default -> System.out.println(" Invalid choice. Please try again.");

			}
			
			// stop booking if seats are full
			
			if(totalSeats == 0){
				break;
			}
			
			
		}
		
		// closing input
		input.close();
	}

}