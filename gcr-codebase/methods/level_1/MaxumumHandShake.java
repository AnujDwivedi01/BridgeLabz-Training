// Java Program for maximum numbers of handshakes

import java.util.Scanner;

public class MaxumumHandShake{
	
	// creating method for  maximum numbers of handshakes
	
	static int maximumNumofHandShake(int numOfStudents){
		  // writting logic
		  int finalnumOfHandShake = (numOfStudents*(numOfStudents-1))/2;
		  
		  //retruning result
		  return finalnumOfHandShake;
		
		  
	}
	
	public static void main(String[] args){
	// create scanner object
	Scanner input = new Scanner(System.in);
	
	//taking User input
	System.out.println("Give The Number of Students");
	int numOfStudents = input.nextInt();
	
	//calling method
	int numOfHandShake = maximumNumofHandShake(numOfStudents);
	
	//printing result
	System.out.println("Maximum num of Hand Shake in "+ numOfStudents + " is "+ numOfHandShake);
	
    //closing input
	input.close();
	
	}
	

}