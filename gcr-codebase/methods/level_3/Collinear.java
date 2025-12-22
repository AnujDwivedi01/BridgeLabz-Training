// java Program to check whether three points are collinear


import java.util.Scanner;

public class Collinear {
	  
	        // Method to check collinearity using slope formula
    private static boolean isCollinearBySlope(int x1, int y1,
                                              int x2, int y2,
                                              int x3, int y3) {

        // To avoid division by zero, compare cross products
        return (y2 - y1) * (x3 - x2) ==
               (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    private static boolean isCollinearByArea(int x1, int y1,
                                             int x2, int y2,
                                             int x3, int y3) {

        // Area of triangle formula
        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        // If area is zero, points are collinear
        return area == 0;
					
		}					
							
											

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for three points
        System.out.print("Enter x1 y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check collinearity using slope method
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area method
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nUsing Slope Method: " +
                (slopeResult ? "Points are Collinear" : "Points are NOT Collinear"));

        System.out.println("Using Area Method : " +
                (areaResult ? "Points are Collinear" : "Points are NOT Collinear"));

        input.close();
    }

}
