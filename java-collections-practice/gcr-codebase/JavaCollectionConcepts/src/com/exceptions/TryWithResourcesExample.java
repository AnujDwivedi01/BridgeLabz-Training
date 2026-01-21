package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("D:\\filehandling\\file1.txt"))) {

			String line = br.readLine();

			if (line != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}
}
