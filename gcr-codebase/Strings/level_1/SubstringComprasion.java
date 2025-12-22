// java program for substring comprasion

import java.util.Scanner;

public class SubstringComprasion{
	// method for checking substring
	public static boolean checkSubstring(String value, int start,int end){
		String value2 = "";
		for(int index=start;index<end;index++){
			value2 += value.charAt(index);
		}
		
		// using built in substring method
		
		String value3 = value.substring(start,end);
		
		// checking both substrings
		boolean areEqual = value2.equals(value3);
		
		//returning result
		return areEqual;
		
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// take user input for substring
		String value = input.next();
		
		// taking indexes by user
		System.out.println("Give Start Index");
		int start = input.nextInt();
	    System.out.println("Give end Index");
		int end = input.nextInt();
		
		
		
		
		//calling method to find substring and orinting result
		if(checkSubstring(value,start,end)){
			System.out.println("Substrings are same by both methods");
		}
		else{
			System.out.println("Substrings are not same by both methods");
		}
		 
	    input.close();
			
	}
}