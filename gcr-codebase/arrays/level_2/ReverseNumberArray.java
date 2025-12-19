//program to reverse a number using array
import java.util.Scanner;

public class ReverseNumberArray
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input number
		System.out.print("Enter number: ");
		int number=input.nextInt();

		int temp=number;
		int count=0;

		//count digits
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}

		int digits[]=new int[count];
		int index=0;

		//store digits
		while(number!=0)
		{
			digits[index]=number%10;
			number=number/10;
			index++;
		}

		//display reversed number
		System.out.print("Reversed number: ");
		for(int i=0;i<digits.length;i++)
		{
			System.out.print(digits[i]);
		}

		input.close();  //closing input stream
	}
}
