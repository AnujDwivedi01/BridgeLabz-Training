package com.streams;

import java.io.*;

public class UppercaseToLowercase {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// FileReader and FileWriter (character streams)
			br = new BufferedReader(new FileReader("D:\\filehandling\\file1.txt"));
			bw = new BufferedWriter(new FileWriter("D:\\filehandling\\file9.txt"));

			String line;

			while ((line = br.readLine()) != null) {
				// Convert each line to lowercase
				bw.write(line.toLowerCase());
				bw.newLine();
			}

			System.out.println("File converted to lowercase successfully.");

		} catch (IOException e) {
			System.out.println("Error while reading or writing the file.");
			e.printStackTrace();

		}

	}
}
