// Java Program to find youngest and tallest friend

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Enter details for " + friends[i]);

            System.out.print("Enter age: ");
            ages[i] = input.nextInt();

            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();
        }

        // Initialize youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest friend
        for (int i = 1; i < friends.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + friends[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + friends[tallestIndex] +
                " (Height: " + heights[tallestIndex] + ")");

        input.close();
    }
}
