// java program for factor operation
import java.util.Scanner;

public class Factors{
	 // method for find factor
	 public static int[] findFactor(int number){
		   int count = 0;

        // First loop to count factors
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                count++;
            }
        }
		
		// Initialize array with factor count
        int[] factors = new int[count];
        int index = 0;
		
		 // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
		return factors;
		 
	 }
	 // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }
	 // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquaresOfFactors(int[] factors) {

        double sumOfSquares = 0;

        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }

        return sumOfSquares;
    }

     public static void main(String[] args){
	      Scanner input = new Scanner(System.in);
		  
		  //take user input
		  int number = input.nextInt();
		  
		  // method for factors
		  int[] factors = findFactor(number);
		  
		   System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
		
		// Calculate results
        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        double sumOfSquares = findSumOfSquaresOfFactors(factors);
		
		 // Display results
        System.out.println("\nSum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);

        input.close();

		  
		  
	 }
}