// Program to calculate Euclidean distance and equation of a line
// Uses Math.pow() and Math.sqrt()
// Equation of line: y = m*x + b

import java.util.Scanner;

public class EuclideanDistance {
	     
		      // Method to calculate Euclidean distance between two points
        private static double calculateDistance(double x1, double y1,
                                            double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }

    // Method to calculate slope and y-intercept
    // Returns array: [0] = slope (m), [1] = y-intercept (b)
    private static double[] calculateLineEquation(double x1, double y1,
                                                  double x2, double y2) {

        // Check for vertical line (division by zero)
        if (x2 == x1) {
            return null;
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for first point
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Take input for second point
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Calculate slope and intercept
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        // Display results
        System.out.printf("\nEuclidean Distance = %.2f%n", distance);

        if (lineEquation != null) {
            System.out.printf("Equation of Line: y = %.2fx + %.2f%n",
                    lineEquation[0], lineEquation[1]);
        } else {
            System.out.println("Equation of Line: Undefined (Vertical Line)");
        }

        input.close();
    }

}
