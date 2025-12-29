/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class DiscountDashboard{
     public static void main(String[] args){
		 
		 Scanner input = new Scanner(System.in);
		 
		 //taking numbers of items
		 System.out.println("Enter numbers of items :  ");
		 int numbersOfItems = input.nextInt();
		 
		 // taking array to store prices
		 
		 double[] prices = new double[numbersOfItems];
		 for(int i=0;i<prices.length;i++){
			 System.out.println("Enter "+ (i+1) +" item price : ");
             prices[i] = input.nextDouble();			 
		 }
		 
		 // total bill
		 double totalBill = 0.0;
		 
		 // performing operations
		 for(int i=0;i<prices.length;i++){
			 double price = prices[i];
			 if(price>=0 && price<=250){
				 double discount = prices[i] * 0.05;
				 price-=discount;
				 System.out.println("Discount for "+prices[i]+ " is "+discount);
				 totalBill+=price;
			 }
			 else if(price>250 && price<=500){
				 double discount = prices[i] * 0.10;
				 price-=discount;
				 System.out.println("Discount for "+prices[i]+ " is "+discount);
				 totalBill+=price;
			 }
			 else if(price>500 && price<=750){
				 double discount = prices[i] * 0.15;
				 price-=discount;
				 System.out.println("Discount for "+prices[i]+ " is "+discount);
				 totalBill+=price;
			 }
			  else if(price>750 && price<=1000){
				 double discount = prices[i] * 0.20;
				 price-=discount;
				 System.out.println("Discount for "+prices[i]+ " is "+discount);
				 totalBill+=price;
			 }
			 else{
				 System.out.println("No Discount for "+prices[i] + " this range");
				 totalBill+=price;
		   }
		 }
		 System.out.println("Total Bill for the items are "+totalBill);
		 
		 input.close();
	 }
}
