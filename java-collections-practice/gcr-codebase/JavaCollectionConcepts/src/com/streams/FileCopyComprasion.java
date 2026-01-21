package com.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyComprasion {

	private static final int BUFFER_SIZE = 4096;

	public static void main(String[] args) {

		File source = new File("D:\\filehandling\\file1.txt");
		File unbufferedDest = new File("D:\\filehandling\\file5.txt");
		File bufferedDest = new File("D:\\filehandling\\file6.txt");

		copyUsingUnbufferedStreams(source, unbufferedDest);
		copyUsingbufferedStreams(source, bufferedDest);

	}

	// unbuffered streams
	public static void copyUsingUnbufferedStreams(File source, File dest) {
		long startTime = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(dest);

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

			fis.close();
			fos.close();

		} catch (IOException e) {
			System.out.println("Error in unbuffered copy.");
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		System.out.println("Unbuffered Stream Time: " + (endTime - startTime) / 1_000_000 + " ms");
	}

	// buffered streams
	public static void copyUsingbufferedStreams(File source, File dest) {
		long startTime = System.nanoTime();

		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
			bis.close();
			bos.close();
		} catch (IOException e) {
			System.out.println("Error in buffered copy.");
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		System.out.println("Buffered Stream Time: " + (endTime - startTime) / 1_000_000 + " ms");

	}
}
