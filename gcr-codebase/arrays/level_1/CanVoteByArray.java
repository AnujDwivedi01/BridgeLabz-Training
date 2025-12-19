// Java Program for Can vote using array

import java.util.Scanner;

public class CanVoteByArray{

               public static void main(String[] args){
			   
			       // create a scanner object
				   Scanner input = new Scanner(System.in);
				   
				   // Declearing an array of size 10
				   int[] age = new int[10];
				   
				   // Reading element from user
				   for(int index = 0; index < age.length; index++){
				        age[index] = input.nextInt();
				   }
				   
				   // Checking condition and printing result
				   
				   for(int index = 0; index < age.length; index++){
					   
					    if(age[index]<0){
							System.out.println(age[index] + " is invalid age");
						}
				        else if(age[index]>=18){
							System.out.println("The Student with age "+ age[index] + " can vote");
						}
						else{
							System.out.println("The Student with age "+ age[index] + " can not vote");
						}
				   }
				   
				   // close Scanner 
				   input.close();
				   
				   
				   
 				  
			   
			   
			   
			   }
   
}