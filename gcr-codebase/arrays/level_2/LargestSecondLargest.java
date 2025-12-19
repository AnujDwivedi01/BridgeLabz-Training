//program to find largest and second largest digit
import java.util.Scanner;

public class LargestSecondLargest
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input number
		System.out.print("Enter number: ");
		int number=input.nextInt();

		int maxDigit=10;
		int digits[]=new int[maxDigit];
		int index=0;

		//store digits in array
		while(number!=0 && index<maxDigit)
		{
			digits[index]=number%10;
			number=number/10;
			index++;
		}

		int largest=0;
		int secondLargest=0;

		//find largest and second largest
		for(int i=0;i<index;i++)
		{
			if(digits[i]>largest)
			{
				secondLargest=largest;
				largest=digits[i];
			}
			else if(digits[i]>secondLargest && digits[i]!=largest)
			{
				secondLargest=digits[i];
			}
		}

		//display result
		System.out.println("Largest Digit: "+largest);
		System.out.println("Second Largest Digit: "+secondLargest);

		input.close();  //closing input stream
	}
}
