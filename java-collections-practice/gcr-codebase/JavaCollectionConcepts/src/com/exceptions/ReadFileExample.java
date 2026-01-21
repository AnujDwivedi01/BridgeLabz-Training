package com.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExample {
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("data.txt");

			int ch;
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}

		} catch (IOException e) {
			System.out.println("File not found");
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing file");
			}
		}
	}
}
