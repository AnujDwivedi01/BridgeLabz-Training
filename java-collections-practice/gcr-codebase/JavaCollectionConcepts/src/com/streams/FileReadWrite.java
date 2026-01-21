package com.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
	public static void main(String[] args) {
		File sourceFile = new File("D:\\filehandling\\file1.txt");
		File destinationFile = new File("D:\\filehandling\\file4.txt");

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			if (!sourceFile.exists()) {
				System.out.println("Source File Do not Exists");
				return;
			}

			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destinationFile);

			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("FileCopied Successfully");
		} catch (IOException e) {
			System.out.println("An Error occured while coping file");
			e.printStackTrace();
		}

	}
}
