// Writting Java Code to performe Largest in three check
import java.util.Scanner;

public class FirstSmallestCheck{
      public static void main(String[] args){
	   // Create Scanner object to take input from user
	   
	   Scanner sc = new Scanner(System.in);
	   
	   // Read input numbers
	   int number1 = sc.nextInt();
	   int number2 = sc.nextInt();
	   int number3 = sc.nextInt();
	   
	   // Checking if the first number is smallest or not
	   
	   boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
	   
	   // Print the result
       System.out.println("Is the first number the smallest? " + isFirstSmallest);
	   
	    // Close the scanner
        sc.close();
	   
	   
	  
    }
}
