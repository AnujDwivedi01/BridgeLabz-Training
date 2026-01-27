package JavaIOStreamsConcepts.jsonfiles;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidation {

	// POJO inside same class
	static class User {
		public String name;
		public String email;
	}

	public static void main(String[] args) {

		String json = "{ \"name\": \"Anuj\", \"email\": \"anuj@gmail.com\" }";

		ObjectMapper mapper = new ObjectMapper();

		try {
			// Validate JSON structure by mapping to POJO
			mapper.readValue(json, User.class);
			System.out.println(" Valid JSON structure");
		} catch (Exception e) {
			System.out.println(" Invalid JSON structure");
		}
	}
}
