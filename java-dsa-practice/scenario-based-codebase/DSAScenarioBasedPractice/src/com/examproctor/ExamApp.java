package com.examproctor;

import java.util.Scanner;

public class ExamApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ExamProctor exam = new ExamProctor();

		while (true) {
			System.out.println("\n1. Visit Question");
			System.out.println("2. Answer Question");
			System.out.println("3. Go Back");
			System.out.println("4. Submit Exam");
			System.out.println("5. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Question ID: ");
				exam.visitQuestion(sc.nextInt());
				break;

			case 2:
				System.out.print("Enter Question ID: ");
				int qId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Answer (A/B/C/D): ");
				String ans = sc.nextLine();
				exam.saveAnswer(qId, ans);
				break;

			case 3:
				exam.goBack();
				break;

			case 4:
				exam.submitExam();
				sc.close();
				return;

			case 5:
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
