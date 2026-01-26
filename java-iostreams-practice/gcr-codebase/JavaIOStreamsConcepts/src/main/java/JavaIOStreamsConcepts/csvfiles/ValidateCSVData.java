package JavaIOStreamsConcepts.csvfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

	// Regex patterns
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String PHONE_REGEX = "^\\d{10}$";

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\contacts.csv";
		String line;

		Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
		Pattern phonePattern = Pattern.compile(PHONE_REGEX);

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			// Skip header
			br.readLine();

			System.out.println("Invalid Records:");
			System.out.println("----------------------------------");

			while ((line = br.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				String[] data = line.split(",");

				String id = data[0];
				String name = data[1];
				String email = data[2];
				String phone = data[3];

				boolean isValid = true;
				StringBuilder errorMsg = new StringBuilder();

				if (!emailPattern.matcher(email).matches()) {
					isValid = false;
					errorMsg.append("Invalid Email ");
				}

				if (!phonePattern.matcher(phone).matches()) {
					isValid = false;
					errorMsg.append("Invalid Phone ");
				}

				if (!isValid) {
					System.out.println("Row ID: " + id + ", Name: " + name + " --> " + errorMsg);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
