// Program to calculate Sam's average percentage in PCM
public class SamAveragePCM {

    public static void main(String[] args) {

        // Declare and initialize marks
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Calculate total marks
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;

        // Calculate average percentage
        double averagePercentage = totalMarks / 3.0;

        // Display the result
        System.out.println("Sam’s average mark in PCM is " +averagePercentage);
    }
}