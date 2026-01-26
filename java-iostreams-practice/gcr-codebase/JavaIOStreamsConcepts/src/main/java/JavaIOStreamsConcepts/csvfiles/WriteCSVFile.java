package JavaIOStreamsConcepts.csvfiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\employees.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			// Writing header
			bw.write("ID,Name,Department,Salary");
			bw.newLine();

			// Writing employee records
			bw.write("201,Anuj,IT,55000");
			bw.newLine();

			bw.write("202,Rahul,HR,48000");
			bw.newLine();

			bw.write("203,Priya,Finance,60000");
			bw.newLine();

			bw.write("204,Neha,Marketing,52000");
			bw.newLine();

			bw.write("205,Amit,Operations,50000");
			bw.newLine();

			System.out.println("CSV file created and data written successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
