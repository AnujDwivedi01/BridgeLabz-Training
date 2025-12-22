// Program to calculate bonus and salary details for Zara employees

public class ZaraEmployeeBonus {

    private static final int EMPLOYEE_COUNT = 10;

    public static void main(String[] args) {

        //  Generate salary and years of service
        double[][] employeeData = generateEmployeeData();

        //  Calculate bonus and new salary
        double[][] updatedSalaryData = calculateBonusAndNewSalary(employeeData);

        // Display report and totals
        displaySalaryReport(employeeData, updatedSalaryData);
    }

    // Method to generate random salary and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    private static double[][] generateEmployeeData() {

        double[][] data = new double[EMPLOYEE_COUNT][2];

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {

            // Generate 5-digit salary (10000 - 99999)
            double salary = 10000 + Math.random() * 90000;

            // Generate years of service (1 - 10)
            int yearsOfService = 1 + (int) (Math.random() * 10);

            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → New Salary, Column 1 → Bonus Amount
    private static double[][] calculateBonusAndNewSalary(double[][] employeeData) {

        double[][] updatedData = new double[EMPLOYEE_COUNT][2];

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    // Method to display employee data and total calculations
    private static void displaySalaryReport(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nZARA EMPLOYEE BONUS REPORT");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s %-15s %-15s%n",
                "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-15.2f %-10.0f %-15.2f %-15.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s : %.2f%n", "Total Old Salary", totalOldSalary);
        System.out.printf("%-20s : %.2f%n", "Total Bonus Paid", totalBonus);
        System.out.printf("%-20s : %.2f%n", "Total New Salary", totalNewSalary);
    }
}
