//Java Program for Garde Calculation

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        // Create Scanner object with reference name "input"
        Scanner input = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter Physics marks: ");
        int physicsMarks = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistryMarks = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int mathsMarks = input.nextInt();

        // Calculate total and average percentage
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double averageMarks = totalMarks / 3.0;

        // Variables for grade and remarks
        String grade;
        String remarks;

        // Determine grade and remarks using control flow statements
        if (averageMarks >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMarks >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMarks >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (averageMarks >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMarks >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display results
        
        System.out.println("Average Marks: " + averageMarks + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close scanner
        input.close();
    }
}
