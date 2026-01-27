package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadJsonKeysValues {

	public static void main(String[] args) throws Exception {

		// Read JSON file into String
		String jsonContent = new String(Files.readAllBytes(Paths.get("D:\\JSON_files\\data.json")));

		// Convert String to JSONObject
		JSONObject jsonObject = new JSONObject(jsonContent);

		// Iterate and print all keys & values
		Iterator<String> keys = jsonObject.keys();

		while (keys.hasNext()) {
			String key = keys.next();
			Object value = jsonObject.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
