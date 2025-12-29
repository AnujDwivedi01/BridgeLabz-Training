// Java program ti calculate BMI by 2D array

import java.util.Scanner;

public class BMICalculation2D {

    // Method to calculate BMI and populate the 3rd column
    public static void calculateBMI(double[][] bmiData) {

        for (int i = 0; i < bmiData.length; i++) {

            double weight = bmiData[i][0];   // in kg
            double heightCm = bmiData[i][1]; // in cm

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            bmiData[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] bmiData) {

        String[] status = new String[bmiData.length];

        for (int i = 0; i < bmiData.length; i++) {

            double bmi = bmiData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 10 rows, 3 columns -> weight, height, BMI
        double[][] bmiData = new double[10][3];

        // Take user input
        for (int i = 0; i < bmiData.length; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            bmiData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            bmiData[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(bmiData);

        // Get BMI status
        String[] bmiStatus = determineBMIStatus(bmiData);

        // Display result
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf(
                "%d\t%.2f\t%.2f\t%.2f\t%s%n",
                (i + 1),
                bmiData[i][0],
                bmiData[i][1],
                bmiData[i][2],
                bmiStatus[i]
            );
        }

        input.close();
    }
}
