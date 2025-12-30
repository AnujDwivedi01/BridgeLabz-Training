/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/
import java.util.Scanner;
public class LibraryReminder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// string array for five books
		String[] books = {"History","Math","Geography","Hindi","English"};
		
		int totalFine = 0;
		//using loop for operations
		for(int i=0;i<books.length;i++){
			System.out.print("Enter " + books[i] + " due date : ");
			int dueDate = input.nextInt();
			System.out.print("Enter " + books[i] + " return date : ");
			int returnDate = input.nextInt();
			
			
			// finding late days
			if(returnDate>dueDate){
			int dayGap = returnDate-dueDate;
			
			// calculating fine
			int fine = 5*dayGap;
			
			// updating fine
			totalFine+=fine;
			}
			
			
		}
		
		System.out.println("Total "+ totalFine + " rupees fine rohan has to pay");
		
		//closing input
		
		input.close();
		
	}
}