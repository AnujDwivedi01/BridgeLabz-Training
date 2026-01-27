package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUsersByAge {

	public static void main(String[] args) {

		String jsonData = "[" + "{\"name\":\"Anuj\",\"age\":22}," + "{\"name\":\"Rahul\",\"age\":28},"
				+ "{\"name\":\"Priya\",\"age\":30}," + "{\"name\":\"Amit\",\"age\":24}" + "]";

		JSONArray users = new JSONArray(jsonData);

		System.out.println("Users older than 25:");

		for (int i = 0; i < users.length(); i++) {
			JSONObject user = users.getJSONObject(i);

			int age = user.optInt("age", 0);

			if (age > 25) {
				System.out.println(user.toString());
			}
		}
	}
}
