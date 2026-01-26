package JavaIOStreamsConcepts.csvfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\large_data.csv";
		Set<String> seenIds = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			boolean isHeader = true;

			while ((line = br.readLine()) != null) {

				// Skip header
				if (isHeader) {
					isHeader = false;
					continue;
				}

				String[] data = line.split(",");
				String id = data[0];

				if (!seenIds.add(id)) {
					System.out.println("Duplicate Record: " + line);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
