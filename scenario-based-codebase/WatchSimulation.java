/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class WatchSimulation{
	public static void main(String[] args){
		
		
		
		//label for outer loop to braek both loop
		watch:
		
		//using for loop for printing
		for(int hour=0;hour<24;hour++){
			//nested loop
			for(int minute =0;minute<60;minute++){
				
				System.out.printf("%02d:%02d%n", hour, minute);
				
				//simulate power cut at 13:00
				if(hour == 13 && minute == 00){
					System.out.println("Power Cut when time is 13:00");
					break watch;
				}
			}
		}
		
		
	}
}