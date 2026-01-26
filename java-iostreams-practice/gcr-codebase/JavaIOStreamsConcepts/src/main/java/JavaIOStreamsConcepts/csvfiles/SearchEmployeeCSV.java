package JavaIOStreamsConcepts.csvfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\employees.csv";
		String line;
		boolean found = false;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name to search: ");
		String searchName = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			// Skip header
			br.readLine();

			while ((line = br.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				String[] data = line.split(",");

				String name = data[1];

				if (name.equalsIgnoreCase(searchName)) {

					String department = data[2];
					String salary = data[3];

					System.out.println("\nEmployee Found!");
					System.out.println("Name       : " + name);
					System.out.println("Department : " + department);
					System.out.println("Salary     : " + salary);

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("\nEmployee not found!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
