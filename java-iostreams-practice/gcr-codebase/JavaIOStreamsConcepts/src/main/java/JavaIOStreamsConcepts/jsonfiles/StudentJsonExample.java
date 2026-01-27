package JavaIOStreamsConcepts.jsonfiles;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonExample {
	public static void main(String[] args) {

		// Create JSON Object
		JSONObject student = new JSONObject();
		student.put("name", "Anuj Dwivedi");
		student.put("age", 22);

		// Create JSON Array for subjects
		JSONArray subjects = new JSONArray();
		subjects.put("Java");
		subjects.put("DSA");
		subjects.put("Database");

		student.put("subjects", subjects);

		// Print JSON
		System.out.println(student.toString(2));
	}
}
