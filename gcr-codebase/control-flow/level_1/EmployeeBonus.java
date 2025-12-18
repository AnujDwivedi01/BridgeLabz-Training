//Writting Java program to find the bonus of employees based on their years of service

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        // Check service years and calculate bonus
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus. Service years must be more than 5.");
        }

        input.close();
    }
}

