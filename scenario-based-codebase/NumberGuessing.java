// java program for number guessing game
import java.util.Scanner;
import java.util.Random;
public class NumberGuessing{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		//Secret Number 1-100
		int secretNumber = random.nextInt(100)+1;
		//guess
		int guess;
		//attempts have
		int attempts = 0;
		
		// maximum attempts
		int maxAttempts = 5;
		
		System.out.println("Welcome to Number Guessing game \n Guess between 1-100 \n you have only 5 attempts");
		
		// do while loop for guessing a number
		
		do{
			System.out.println("Enter your guess");
			guess = input.nextInt();
			attempts++;
			
			// checking high condition
			if(guess>secretNumber){
				System.out.println("Too High!!!");
			}
			// checking low condition 
			else if(guess<secretNumber){
				System.out.println("Too Low !!!");
			}
			//reached condition
			else{
				System.out.println("You have Gussed the secretNumber "+secretNumber+ " correct in "+ attempts + "attempts");
				break;
			}
			
			
			
		} while(attempts<maxAttempts);
		
		if(guess != secretNumber){
			System.out.println("Game Over The correct number was  "+ secretNumber);
		}
		input.close();
		
		
	}
}