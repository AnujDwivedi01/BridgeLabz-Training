package com.streams.serialization.saveandretriveobjects;

import java.io.*;
import java.util.ArrayList;

public class EmployeeSerialization {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Anuj", "IT", 45000));
		employees.add(new Employee(2, "Rahul", "HR", 38000));
		employees.add(new Employee(3, "Priya", "Finance", 52000));

		String fileName = "D:\\filehandling\\file8.txt";

		//  SERIALIZATION
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

			oos.writeObject(employees);
			oos.close();

			System.out.println("Employees serialized successfully.");

		} catch (IOException e) {
			System.out.println("Error during serialization.");
			e.printStackTrace();
		}

		//  DESERIALIZATION
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

			ArrayList<Employee> empList = (ArrayList<Employee>) ois.readObject();

			ois.close();

			System.out.println("\nDeserialized Employee Data:");
			for (Employee emp : empList) {
				emp.display();
			}

		} catch (IOException e) {
			System.out.println("Error during deserialization.");
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			System.out.println("Employee class not found.");
			e.printStackTrace();
		}
	}
}
