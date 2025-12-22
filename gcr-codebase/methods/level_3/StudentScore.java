//java  Program to calculate total, average, percentage, and grade of students
// Subjects: Physics, Chemistry, Maths (PCM)
// Uses 2D arrays, Math.random(), Math.round()

import java.util.Scanner;

public class StudentScore {
	
     // Method to generate random 2-digit PCM scores
    // Column: 0-Physics, 1-Chemistry, 2-Maths
    private static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90); // Physics
            scores[i][1] = 10 + (int) (Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int) (Math.random() * 90); // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    // Column: 0-Total, 1-Average, 2-Percentage
    private static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to determine grade based on percentage
    private static String calculateGrade(double percentage) {

        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard in tabular format
    private static void displayScoreCard(int[][] scores, double[][] results) {

        System.out.println("\nSTUDENT SCORECARD");
        System.out.println("-------------------------------------------------------------");
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            String grade = calculateGrade(results[i][2]);

            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t\t" +
                    grade
            );
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Generate PCM scores
        int[][] pcmScores = generatePCMScores(students);

        // Calculate total, average, percentage
        double[][] resultData = calculateResults(pcmScores);

        // Display scorecard
        displayScoreCard(pcmScores, resultData);

        input.close();
    }
}
