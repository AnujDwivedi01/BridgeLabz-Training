/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/
import java.util.Scanner;
public class SandeepFitness{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//taking array for week input
		
		int[] week = new int[7];
		int totalPushUps = 0;
		int days = 0;
		
		//taking for - each loop for operations and user input
		
		for(int num : week){
			System.out.print("Enter day "+ (days+1) +" push ups : ");
			num = input.nextInt();
			days++;
			//rest day
			if(num == 0){
				continue;
			}
			
			//total push-ups
			else{
				totalPushUps+=num;
			}
						
		}
		// for average push ups
		int avgPushUps = totalPushUps/7;
		
		System.out.println("Sandeep's total push-ups in week is : "+ totalPushUps);
		System.out.println("Sandeep's average push-ups in week is : "+ avgPushUps);
		
		//closing input
		input.close();
	}
}