package JavaIOStreamsConcepts.jsonfiles;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonExample {

	public static void main(String[] args) throws Exception {

		// Read JSON file as String
		String content = new String(Files.readAllBytes(Paths.get("D:\\JSON_files\\usere.json")));

		// Convert String to JSONObject
		JSONObject json = new JSONObject(content);

		// Extract specific fields
		String name = json.getString("name");
		String email = json.getString("email");

		// Print extracted values
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}
}
