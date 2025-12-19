// Java Program for Array sum


import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
	    // Create scanner object
		
		Scanner input = new Scanner(System.in);

        // Create array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            // Break if input is 0 or negative
            if (value <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                break;
            }

            // Store value and increment index
            numbers[index] = value;
            index++;
        }

        // Display values and calculate total
        
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("\nTotal sum = " + total);

        input.close();
    }
}
