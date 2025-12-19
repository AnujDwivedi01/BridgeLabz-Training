//program to calculate BMI and display height, weight, BMI and status
import java.util.Scanner;

public class BMICalculation
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//take input for number of persons
		System.out.print("Enter number of persons: ");
		int number=input.nextInt();

		//create arrays to store data
		double weight[]=new double[number];
		double height[]=new double[number];
		double bmi[]=new double[number];
		String status[]=new String[number];

		//take input for weight and height
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter details of person "+(i+1));

			//input weight
			System.out.print("Enter weight (kg): ");
			weight[i]=input.nextDouble();

			//check for valid weight
			if(weight[i]<=0)
			{
				i--;
				continue;
			}

			//input height
			System.out.print("Enter height (meters): ");
			height[i]=input.nextDouble();

			//check for valid height
			if(height[i]<=0)
			{
				i--;
				continue;
			}
		}

		//calculate BMI and determine status
		for(int i=0;i<number;i++)
		{
			//calculate BMI
			bmi[i]=weight[i]/(height[i]*height[i]);

			//find weight status using BMI table
			if(bmi[i]<18.5)
			{
				status[i]="Underweight";
			}
			else if(bmi[i]>=18.5 && bmi[i]<=24.9)
			{
				status[i]="Normal";
			}
			else if(bmi[i]>=25.0 && bmi[i]<=39.9)
			{
				status[i]="Overweight";
			}
			else
			{
				status[i]="Obese";
			}
		}

		//display height, weight, BMI and status
		System.out.println("\nBMI Details:");
		for(int i=0;i<number;i++)
		{
			System.out.println("Person "+(i+1));
			System.out.println("Weight: "+weight[i]+" kg");
			System.out.println("Height: "+height[i]+" meters");
			System.out.println("BMI: "+bmi[i]);
			System.out.println("Status: "+status[i]);
			System.out.println();
		}

		input.close();  //closing input stream
	}
}
