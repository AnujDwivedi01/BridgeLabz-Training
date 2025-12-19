// Java Program fir mean Height

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Read heights from user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        // Display mean height
        System.out.println("Mean height of the football team = " + meanHeight);

        input.close();
    }
}
