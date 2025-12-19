//program to calculate BMI and weight status using 2-D array
import java.util.Scanner;

public class BMICalculation2D
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//take input for number of persons
		System.out.print("Enter number of persons: ");
		int number=input.nextInt();

		//2-D array to store weight, height and BMI
		//index 0 -> weight, 1 -> height, 2 -> BMI
		double[][] personData=new double[number][3];

		//array to store weight status
		String[] weightStatus=new String[number];

		//take input for weight and height
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter details of person "+(i+1));

			//input weight
			System.out.print("Enter weight (kg): ");
			personData[i][0]=input.nextDouble();

			if(personData[i][0]<=0)
			{
				i--;
				continue;
			}

			//input height
			System.out.print("Enter height (meters): ");
			personData[i][1]=input.nextDouble();

			if(personData[i][1]<=0)
			{
				i--;
				continue;
			}
		}

		//calculate BMI and determine weight status
		for(int i=0;i<number;i++)
		{
			//calculate BMI
			personData[i][2]=personData[i][0]/
			                 (personData[i][1]*personData[i][1]);

			//determine weight status using BMI table
			if(personData[i][2]<18.5)
			{
				weightStatus[i]="Underweight";
			}
			else if(personData[i][2]>=18.5 && personData[i][2]<=24.9)
			{
				weightStatus[i]="Normal";
			}
			else if(personData[i][2]>=25.0 && personData[i][2]<=39.9)
			{
				weightStatus[i]="Overweight";
			}
			else
			{
				weightStatus[i]="Obese";
			}
		}

		//display height, weight, BMI and status
		System.out.println("\nBMI Details of Persons:");
		for(int i=0;i<number;i++)
		{
			System.out.println("Person "+(i+1));
			System.out.println("Weight: "+personData[i][0]+" kg");
			System.out.println("Height: "+personData[i][1]+" meters");
			System.out.println("BMI: "+personData[i][2]);
			System.out.println("Status: "+weightStatus[i]);
			System.out.println();
		}

		input.close();  //closing input stream
	}
}
