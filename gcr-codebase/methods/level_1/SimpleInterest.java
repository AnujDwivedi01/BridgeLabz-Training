// Java Program for Simple Interest calculate

import java.util.Scanner;

public class SimpleInterest{
	
	//creating method for simple interest
	static double finalInterest(double principle, double rate, double time){
		// writting logic
		double interest = (principle*rate*time)/100;
		
		// returning result
	    return interest;
	}
	
	
	
	public static void main(String[] args){
	//creating scanner object
	Scanner input = new Scanner(System.in);
	
	//taking user input
	System.out.println("Enter Principle : ");
	double principle = input.nextDouble();
	System.out.println("Enter Rate  : ");
	double rate = input.nextDouble();
	System.out.println("Enter Time : ");
	double time = input.nextDouble();
	
	//calling method 
	
	double interest = finalInterest(principle,rate,time);
	
	//printing result
	System.out.println("The Simple Interest is "+ interest + " for principle "+ principle + " Rate of Interest " + rate + " and time "+ time);
	
	// closing input
	input.close();
	
}
}