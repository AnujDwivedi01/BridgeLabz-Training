package JavaIOStreamsConcepts.jsonfiles;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJsonByAge {

	public static void main(String[] args) {

		String jsonData = "[" + "{\"name\":\"Anuj\",\"age\":22}," + "{\"name\":\"Rahul\",\"age\":28},"
				+ "{\"name\":\"Priya\",\"age\":30}," + "{\"name\":\"Amit\",\"age\":24}" + "]";

		JSONArray jsonArray = new JSONArray(jsonData);

		System.out.println("People with age > 25:");

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			int age = obj.getInt("age");

			if (age > 25) {
				System.out.println(obj.toString());
			}
		}
	}
}
