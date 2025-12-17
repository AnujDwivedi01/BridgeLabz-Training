// Create a class ProfitLossPercantage to calculate the the profit and loss in number and percentage.
public class ProfitLossPercentage{
  public static void main(String args[])
  {
//Create a variable costPrice indicates the cost price.
	double costPrice=129;
   
//Create a variable sellingPrice indicates the Selling price.   
	double sellingPrice=191;
   
//Create a variable profit indicates the Total Profit.   
	double profit= sellingPrice-costPrice;
			
//Create a variable profitPercentage indicates the profit percentage.
    double profitPercentage=(profit/costPrice)*100;
	
// Print the Cost Price, selling Price, Profit and Profit Percantage.
		System.out.println("The Cost Price is INR" + costPrice + "and Selling Price is INR" + sellingPrice  + "\nThe Profit is INR" + profit +"and the Profit Percentage is" + profitPercentage);
     
  }
  
}