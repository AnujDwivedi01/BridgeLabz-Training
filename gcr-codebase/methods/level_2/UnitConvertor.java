//program to perform unit conversions using static methods
import java.util.Scanner;

public class UnitConvertor
{
	//method to convert kilometers to miles
	public static double convertKmToMiles(double km)
	{
		double km2miles=0.621371;
		return km*km2miles;
	}

	//method to convert miles to kilometers
	public static double convertMilesToKm(double miles)
	{
		double miles2km=1.60934;
		return miles*miles2km;
	}

	//method to convert meters to feet
	public static double convertMetersToFeet(double meters)
	{
		double meters2feet=3.28084;
		return meters*meters2feet;
	}

	//method to convert feet to meters
	public static double convertFeetToMeters(double feet)
	{
		double feet2meters=0.3048;
		return feet*feet2meters;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input for kilometer to miles conversion
		System.out.print("Enter kilometers: ");
		double km=input.nextDouble();

		//call method and display result
		System.out.println("Miles: "+convertKmToMiles(km));

		//get input for miles to kilometer conversion
		System.out.print("Enter miles: ");
		double miles=input.nextDouble();

		//call method and display result
		System.out.println("Kilometers: "+convertMilesToKm(miles));

		//get input for meters to feet conversion
		System.out.print("Enter meters: ");
		double meters=input.nextDouble();

		//call method and display result
		System.out.println("Feet: "+convertMetersToFeet(meters));

		//get input for feet to meters conversion
		System.out.print("Enter feet: ");
		double feet=input.nextDouble();

		//call method and display result
		System.out.println("Meters: "+convertFeetToMeters(feet));

		input.close(); //closing input stream
	}
}
