package com.sorting.examcell;

public class ExamCellApp {

	public static void main(String[] args) {

		// merged scores from multiple centers
		Student[] students = {
				new Student("Amit", 88),
				new Student("Riya", 92),
				new Student("Karan", 75),
				new Student("Neha", 95),
				new Student("Sonal", 88),
				new Student("Arjun", 90)
		};

		ExamCellSorter sorter = new ExamCellSorter();

		System.out.println("Before Ranking:");
		for (Student s : students) {
			System.out.println(s);
		}

		sorter.divide(students, 0, students.length - 1);

		System.out.println("\nState-Level Rank List:");
		sorter.display(students);
	}
}
