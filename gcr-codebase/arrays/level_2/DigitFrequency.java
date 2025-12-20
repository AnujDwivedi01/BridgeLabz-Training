//program to find frequency of each digit in a number
import java.util.Scanner;

public class DigitFrequency
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input number
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		int temp=number;
		int count=0;

		//count number of digits
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}

		//create array to store digits
		int digits[]=new int[count];
		int index=0;

		//store digits in array
		while(number!=0)
		{
			digits[index]=number%10;
			number=number/10;
			index++;
		}

		//create frequency array of size 10
		int frequency[]=new int[10];

		//calculate frequency
		for(int i=0;i<digits.length;i++)
		{
			frequency[digits[i]]++;
		}

		//display frequency
		System.out.println("Digit Frequency:");
		for(int i=0;i<10;i++)
		{
			if(frequency[i]>0)
			{
				System.out.println(i+" -> "+frequency[i]);
			}
		}

		input.close();  //closing input stream
	}
}
