// java program for wind chill calculation

import java.util.Scanner;

public class WindChillCalculation {
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take temperature and wind speed as input
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();

        // Call method to calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature = " + windChill);

        input.close();
    }

    
}
