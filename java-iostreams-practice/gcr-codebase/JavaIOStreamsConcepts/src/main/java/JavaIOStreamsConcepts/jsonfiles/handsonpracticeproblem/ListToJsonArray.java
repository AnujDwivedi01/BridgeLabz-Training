package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {

	// POJO inside same class
	static class Student {
		String name;
		int age;

		Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {

		// Create list of Student objects
		List<Student> students = new ArrayList<>();
		students.add(new Student("Anuj", 22));
		students.add(new Student("Rahul", 26));
		students.add(new Student("Priya", 28));

		// Convert list to JSON array
		JSONArray jsonArray = new JSONArray();

		for (Student s : students) {
			JSONObject obj = new JSONObject();
			obj.put("name", s.name);
			obj.put("age", s.age);
			jsonArray.put(obj);
		}

		// Print JSON array
		System.out.println(jsonArray.toString(2));
	}
}
