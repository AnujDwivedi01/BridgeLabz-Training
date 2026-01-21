package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileErrorReader {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("D:\\filehandling\\file1.txt"));

			String line;

			while ((line = br.readLine()) != null) {
				// Case-insensitive check
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			System.out.println("Error while reading the file.");
			e.printStackTrace();

		}
	}
}
