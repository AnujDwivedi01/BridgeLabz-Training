// java program to calculate trignometric function

import java.util.Scanner;

public class TrigonometricFunctions {
    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results as array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take angle input in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Call method to calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine value = " + result[0]);
        System.out.println("Cosine value = " + result[1]);
        System.out.println("Tangent value = " + result[2]);

        input.close();
    }

    
}
