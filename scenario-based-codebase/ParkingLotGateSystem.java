//java program for parking lot system

import java.util.Scanner;

public class ParkingLotGateSystem{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// total capacity
		int totalCapacity = 5;
		// occupied
		int occupiedCapacity = 0;
		//user choice
		int choice;
		
		System.out.println("Welcome to parking lot Gate System");
		
		
		// using while loop for displaying menu and checking all the cases
		while(true){
			  // dispalying menu
			  System.out.println("\n Enter your choice");
			  System.out.println("1 -> Vehicle Parking");
			  System.out.println("2 -> Vehicle Exiting");
			  System.out.println("3 -> Show Occupancy");
			  System.out.println("4 -> Exit system");
			  
			  //user choice
			  choice = input.nextInt();
			  
			  // using switch for jumping to equations
			  
			  switch(choice){
				  // first case
				  case 1 : if(occupiedCapacity<totalCapacity){
					  System.out.println("Vehicle parked Successfully");
					  occupiedCapacity++;
				  } else{
					  System.out.println("No Parking Space Avilable");
					  return;
				  }
				  break;
				  
				  // Second Case
				  case 2: if(occupiedCapacity>0){
					  occupiedCapacity--;
					  System.out.println("Vehicle Exited successfully");
				  } else{
					  System.out.println("Parking Lot is Empty");
				  }
				  break;
				  
				  // Third Case
				  case 3: System.out.println("occupied slots "+ occupiedCapacity);
				          System.out.println("Avilable Slots "+(totalCapacity-occupiedCapacity));
				  break;
				  
				  // fourth case
				  
				  case 4: System.out.println("Exiting parking lot gate system");
				      return;
				 
				  
				  // default case
				   default: System.out.println("Enter a valid Number");
			  }
			
			
		}
			
	}
}