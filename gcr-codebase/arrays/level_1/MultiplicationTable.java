// Java Program for multiplication table

import java.util.Scanner;

 public class MultiplicationTable{
	  public static void main(String[] args){
		  
		  
	 // Create Scanner object
	 Scanner input = new Scanner(System.in);
	 
	 // take the input
	 int number = input.nextInt();
	 
	 // careatinng 10 size array for storing
	 int Numbers[] = new int[10];
	 
	 // Writitng logic 
	 
	 for(int index = 0; index < 10; index++){
		 int newNumber = number*(index+1);
		 Numbers[index] = newNumber;
	 }
	 //  printing result
	  for(int index = 0; index <10; index++){
		 System.out.println(number+ " * "+ (index+1) + " = " + Numbers[index]);
	 }
	 
	 //close Scanner 
	 input.close();
	 
    }
	 
	 
 }
 