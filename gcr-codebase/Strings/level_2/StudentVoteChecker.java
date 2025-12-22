// java program for student vote cheker

import java.util.Scanner;

public class StudentVoteChecker {

    // method to generate random 2-digit ages for n students
    public static int[] generateStudentAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // method to display result in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate ages
        int[] ages = generateStudentAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Display result
        displayResult(votingStatus);

        input.close();
    }
}
