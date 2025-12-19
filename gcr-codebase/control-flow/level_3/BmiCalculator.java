// Java Program for BMI Calculator

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for weight (in kg)
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        // Take user input for height (in cm)
        System.out.print("Enter height in cm: ");
        double heightInCm = input.nextDouble();

        // Convert height from cm to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI using formula
        double bmi = weight / (heightInMeter * heightInMeter);

        // Determine BMI status
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
       
        System.out.println("BMI Value: " + bmi);
        System.out.println("Weight Status: " + status);

        // Close scanner
        input.close();
    }
}
