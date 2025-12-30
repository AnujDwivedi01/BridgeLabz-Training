/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/
import java.util.Scanner;
public class TemperatureLogger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking array for 7 dayss
		double[] tempOfDay  = new double[7];
		
		// taking user input for temperature
		for(int i=0;i<tempOfDay.length;i++){
			System.out.print("Enter Temperature of " +(i+1) +" day : ");
			tempOfDay[i] = input.nextDouble();
		}
		
		// using for loop for max temp
		double maxTemp = tempOfDay[0];
		double totalTemp = 0;
		for(int i=0;i<tempOfDay.length;i++){
			//finding max temp
			if(tempOfDay[i]>maxTemp){
				maxTemp = tempOfDay[i];
			}
			
			
			//finding total temp as well
			totalTemp+=tempOfDay[i];
		}
		
		// finding average temperature
		double avgTemp = totalTemp/7;
		
		System.out.println("Max Temperature among 7 days is : "+ maxTemp);
		System.out.println("Average Temperature among 7 days is : "+ avgTemp);
		
		//closing input
		input.close();
	}
}