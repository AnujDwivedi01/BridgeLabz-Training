// Java Program for Number Check By Array

import java.util.Scanner;

public class NumberCheckByArray{
	
	   public static void main(String[] args){
		   
		           // create a scanner object
				   Scanner input = new Scanner(System.in);
				   
				   // Declearing an array of size 5
				   int[] numbers = new int[5];
				   
				    // Reading element from user
				   for(int index = 0; index < numbers.length; index++){
				        numbers[index] = input.nextInt();
				   }
				   
				   
				   // Wiritng condition and printing result
				   for(int index = 0; index < numbers.length; index++){
				        int value = numbers[index];
						if(value>0){
							if(value%2 == 0){
								System.out.println(value + " is even");
							}
							else{
								System.out.println(value + " is odd");
							}
						}
						else if(value<0){
							    System.out.println(value + " is Negative");
						}
						else{
							System.out.println(value + " is zero");
						}
				   }
				   
				   // first and last index check
				   
				   int firstElement = numbers[0];
				   int lastElement  = numbers[numbers.length-1];
				   
				   if (firstElement == lastElement) {
                   System.out.println("First and last elements are Equal");
                   } 
				   else if (firstElement > lastElement) {
                   System.out.println("First element is Greater than last element");
                   } 
				   else {
                   System.out.println("First element is Less than last element");
                   }
				   
				   // close Scanner 
				   input.close();
				   
				   
				   
				   
				   
	   }
}