package JavaIOStreamsConcepts.csvfiles.sortsalarybycsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCSVBySalary {

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\employees.csv";
		String line;

		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			// Skip header
			br.readLine();

			while ((line = br.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				String department = data[2];
				int salary = Integer.parseInt(data[3]);

				employees.add(new Employee(id, name, department, salary));
			}

			// Sort by salary in descending order
			Collections.sort(employees, (e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()));

			System.out.println("Top 5 Highest-Paid Employees:");
			System.out.println("--------------------------------");

			for (int i = 0; i < Math.min(5, employees.size()); i++) {
				System.out.println(employees.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
