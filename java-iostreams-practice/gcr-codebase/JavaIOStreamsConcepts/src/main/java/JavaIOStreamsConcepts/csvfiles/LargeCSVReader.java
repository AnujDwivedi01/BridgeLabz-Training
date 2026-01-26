package JavaIOStreamsConcepts.csvfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

	public static void main(String[] args) {

		String filePath = "D:\\CSV_files\\large_data.csv"; // path to large CSV
		int batchSize = 100;
		int totalCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			List<String> batch = new ArrayList<>(batchSize);

			while ((line = br.readLine()) != null) {
				batch.add(line);

				if (batch.size() == batchSize) {
					totalCount += processBatch(batch);
					System.out.println("Records processed: " + totalCount);
					batch.clear();
				}
			}

			// Process remaining lines
			if (!batch.isEmpty()) {
				totalCount += processBatch(batch);
				System.out.println("Records processed: " + totalCount);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int processBatch(List<String> batch) {
		// Example processing (can parse CSV here)
		return batch.size();
	}
}
