2package com.geomeasuresolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeoMeasureApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Line> lines = new ArrayList<>();

		System.out.print("How many line comparisons? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n * 2; i++) {
			System.out.println("Enter coordinates for Line " + i + " (x1 y1 x2 y2):");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();

			lines.add(new Line(x1, y1, x2, y2));
		}

		System.out.println("\n--- Line Comparisons ---");
		for (int i = 0; i < lines.size(); i += 2) {
			LineComparator.compare(lines.get(i), lines.get(i + 1));
		}

		sc.close();
	}
}
