package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeJsonFiles {

	public static void main(String[] args) throws Exception {

		// Read first JSON file
		String json1Str = new String(Files.readAllBytes(Paths.get("D:\\JSON_files\\file1.json")));

		// Read second JSON file
		String json2Str = new String(Files.readAllBytes(Paths.get("D:\\JSON_files\\file2.json")));

		JSONObject json1 = new JSONObject(json1Str);
		JSONObject json2 = new JSONObject(json2Str);

		// Merge json2 into json1
		for (String key : json2.keySet()) {
			json1.put(key, json2.get(key));
		}

		// Print merged JSON
		System.out.println(json1.toString(2));
	}
}
