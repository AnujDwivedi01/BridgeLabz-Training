package JavaIOStreamsConcepts.csvfiles.csvtoobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObjects {

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\students.csv";
		String line;

		List<Student> studentList = new ArrayList<>();

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
				int age = Integer.parseInt(data[2]);
				int marks = Integer.parseInt(data[3]);

				Student student = new Student(id, name, age, marks);
				studentList.add(student);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Print students
		System.out.println("Student List:");
		System.out.println("----------------------");
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
}
