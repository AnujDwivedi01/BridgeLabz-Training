package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlExample {

	public static void main(String[] args) {

		// Sample JSON
		String jsonStr = "{" + "\"student\":{" + "  \"name\":\"Anuj\"," + "  \"age\":22,"
				+ "  \"email\":\"anuj@gmail.com\"" + "}" + "}";

		// Convert JSON String to JSONObject
		JSONObject jsonObject = new JSONObject(jsonStr);

		// Convert JSONObject to XML
		String xml = XML.toString(jsonObject);

		// Print XML
		System.out.println(xml);
	}
}
