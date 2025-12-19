import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;

        // Arrays to store salary and years of service
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];

        // Arrays to store bonus and new salary
        double[] bonusAmount = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Taking input for salary and years of service
        for (int i = 0; i < totalEmployees; i++) {

            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double enteredSalary = input.nextDouble();

            System.out.print("Enter years of service: ");
            double enteredYears = input.nextDouble();

            // Validate input
            if (enteredSalary <= 0 || enteredYears < 0) {
                System.out.println("Invalid input. Please enter valid values again.");
                i--; // decrement index to repeat for same employee
                continue;
            }

            salary[i] = enteredSalary;
            yearsOfService[i] = enteredYears;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < totalEmployees; i++) {

            // Bonus calculation
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }

            // New salary calculation
            newSalary[i] = salary[i] + bonusAmount[i];

            // Total calculations
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println(
                "Employee " + (i + 1) +
                " | Old Salary: " + salary[i] +
                " | Bonus: " + bonusAmount[i] +
                " | New Salary: " + newSalary[i]
            );
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
