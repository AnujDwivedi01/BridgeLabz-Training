package JavaIOStreamsConcepts.csvfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

	public static void main(String[] args) {

		String inputFile = "D:\\CSV_files\\employees.csv";
		String outputFile = "D:\\CSV_files\\employees_updated.csv";

		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			// Read and write header
			String header = br.readLine();
			bw.write(header);
			bw.newLine();

			while ((line = br.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				String[] data = line.split(",");

				String id = data[0];
				String name = data[1];
				String department = data[2];
				double salary = Double.parseDouble(data[3]);

				// Increase salary by 10% for IT department
				if (department.equalsIgnoreCase("IT")) {
					salary = salary + (salary * 0.10);
				}

				// Write updated record
				bw.write(id + "," + name + "," + department + "," + (int) salary);
				bw.newLine();
			}

			System.out.println("Employee salaries updated successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
