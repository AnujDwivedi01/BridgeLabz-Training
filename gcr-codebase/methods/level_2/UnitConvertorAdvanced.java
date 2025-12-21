//java program to perform temperature, weight and volume conversions
import java.util.Scanner;

public class UnitConvertorAdvanced
{
	//method to convert Fahrenheit to Celsius
	public static double convertFarhenheitToCelsius(double farhenheit)
	{
		return (farhenheit-32)*5/9;
	}

	//method to convert Celsius to Fahrenheit
	public static double convertCelsiusToFarhenheit(double celsius)
	{
		return (celsius*9/5)+32;
	}

	//method to convert pounds to kilograms
	public static double convertPoundsToKilograms(double pounds)
	{
		double pounds2kilograms=0.453592;
		return pounds*pounds2kilograms;
	}

	//method to convert kilograms to pounds
	public static double convertKilogramsToPounds(double kilograms)
	{
		double kilograms2pounds=2.20462;
		return kilograms*kilograms2pounds;
	}

	//method to convert gallons to liters
	public static double convertGallonsToLiters(double gallons)
	{
		double gallons2liters=3.78541;
		return gallons*gallons2liters;
	}

	//method to convert liters to gallons
	public static double convertLitersToGallons(double liters)
	{
		double liters2gallons=0.264172;
		return liters*liters2gallons;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input for Fahrenheit to Celsius
		System.out.print("Enter Fahrenheit: ");
		double f=input.nextDouble();
		System.out.println("Celsius: "+convertFarhenheitToCelsius(f));

		//get input for Celsius to Fahrenheit
		System.out.print("Enter Celsius: ");
		double c=input.nextDouble();
		System.out.println("Fahrenheit: "+convertCelsiusToFarhenheit(c));

		//get input for pounds to kilograms
		System.out.print("Enter pounds: ");
		double pounds=input.nextDouble();
		System.out.println("Kilograms: "+convertPoundsToKilograms(pounds));

		//get input for kilograms to pounds
		System.out.print("Enter kilograms: ");
		double kg=input.nextDouble();
		System.out.println("Pounds: "+convertKilogramsToPounds(kg));

		//get input for gallons to liters
		System.out.print("Enter gallons: ");
		double gallons=input.nextDouble();
		System.out.println("Liters: "+convertGallonsToLiters(gallons));

		//get input for liters to gallons
		System.out.print("Enter liters: ");
		double liters=input.nextDouble();
		System.out.println("Gallons: "+convertLitersToGallons(liters));

		input.close(); //closing input stream
	}
}
