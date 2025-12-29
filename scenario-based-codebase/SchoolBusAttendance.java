/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendance{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// an array of 10 students of class
		String[] students ={
            "Amit", "Ravi", "Neha", "Sita", "Rahul",
            "Anita", "Vikas", "Pooja", "Karan", "Meena"
        };
		
		// taking presentcount and absentcount
		
		int presentCount = 0;
		int absentCount = 0;
		
		for(String student : students){
			// checking studnet present or absent
			System.out.print(student + " (Present/Absent): ");
            String status = input.next();
			
			//updating value
			
			if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        
			 
		}
       
         // displaying result

        System.out.println("\n--- Attendance Summary ---");
        System.out.println("Present Students: " + presentCount);
        System.out.println("Absent Students: " + absentCount);

        input.close();		 
		
	}
}
