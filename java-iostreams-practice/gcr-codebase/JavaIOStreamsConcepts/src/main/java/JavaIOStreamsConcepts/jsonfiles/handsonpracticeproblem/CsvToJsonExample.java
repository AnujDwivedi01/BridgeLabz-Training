package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvToJsonExample {

	public static void main(String[] args) throws Exception {

		// Read all lines from CSV file
		List<String> lines = Files.readAllLines(Paths.get("D:\\CSV_files\\students.csv"));

		// First line contains headers
		String[] headers = lines.get(0).split(",");

		JSONArray jsonArray = new JSONArray();

		// Process remaining lines
		for (int i = 1; i < lines.size(); i++) {
			String[] values = lines.get(i).split(",");

			JSONObject obj = new JSONObject();
			for (int j = 0; j < headers.length; j++) {
				obj.put(headers[j], values[j]);
			}

			jsonArray.put(obj);
		}

		// Print JSON
		System.out.println(jsonArray.toString(2));
	}
}
