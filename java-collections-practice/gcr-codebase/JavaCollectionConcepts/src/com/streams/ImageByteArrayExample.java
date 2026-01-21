package com.streams;

import java.io.*;

public class ImageByteArrayExample {

	public static void main(String[] args) {

		String inputImage = "D:\\filehandling\\photo anuj 1.jpg";
		String outputImage = "D:\\filehandling\\photo anuj 2.jpg";

		byte[] imageBytes = null;

		// 🔹 Step 1: Read image and convert to byte array
		try {
			FileInputStream fis = new FileInputStream(inputImage);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			byte[] buffer = new byte[4096];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}

			imageBytes = baos.toByteArray();

			fis.close();
			baos.close();

			System.out.println("Image converted to byte array.");

		} catch (IOException e) {
			System.out.println("Error reading image file.");
			e.printStackTrace();
			return;
		}

		// 🔹 Step 2: Write byte array back to image
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);

			FileOutputStream fos = new FileOutputStream(outputImage);

			byte[] buffer = new byte[4096];
			int bytesRead;

			while ((bytesRead = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

			bais.close();
			fos.close();

			System.out.println("Byte array written back to image.");

		} catch (IOException e) {
			System.out.println("Error writing image file.");
			e.printStackTrace();
			return;
		}

		// 🔹 Step 3: Verify both images are identical
		try {
			FileInputStream fis1 = new FileInputStream(inputImage);
			FileInputStream fis2 = new FileInputStream(outputImage);

			int b1, b2;
			boolean identical = true;

			while ((b1 = fis1.read()) != -1 && (b2 = fis2.read()) != -1) {

				if (b1 != b2) {
					identical = false;
					break;
				}
			}

			fis1.close();
			fis2.close();

			if (identical)
				System.out.println("Verification successful: Images are identical.");
			else
				System.out.println("Images are NOT identical.");

		} catch (IOException e) {
			System.out.println("Error verifying image files.");
			e.printStackTrace();
		}
	}
}
