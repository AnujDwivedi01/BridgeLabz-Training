package JavaIOStreamsConcepts.csvfiles.mergetwocsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

	public static void main(String[] args) {

		String file1 = "D:\\CSV_files\\students1.csv";
		String file2 = "D:\\CSV_files\\students2.csv";
		String outputFile = "D:\\CSV_files\\students_merged.csv";

		Map<Integer, StudentBasic> studentMap = new HashMap<>();
		String line;

		try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
				BufferedReader br2 = new BufferedReader(new FileReader(file2));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			// Read students1.csv
			br1.readLine(); // skip header
			while ((line = br1.readLine()) != null) {

				if (line.trim().isEmpty())
					continue;

				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int age = Integer.parseInt(data[2]);

				studentMap.put(id, new StudentBasic(name, age));
			}

			// Write output header
			bw.write("ID,Name,Age,Marks,Grade");
			bw.newLine();

			// Read students2.csv and merge
			br2.readLine(); // skip header
			while ((line = br2.readLine()) != null) {

				if (line.trim().isEmpty())
					continue;

				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				int marks = Integer.parseInt(data[1]);
				String grade = data[2];

				if (studentMap.containsKey(id)) {

					StudentBasic sb = studentMap.get(id);

					bw.write(id + "," + sb.name + "," + sb.age + "," + marks + "," + grade);
					bw.newLine();
				}
			}

			System.out.println("CSV files merged successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
