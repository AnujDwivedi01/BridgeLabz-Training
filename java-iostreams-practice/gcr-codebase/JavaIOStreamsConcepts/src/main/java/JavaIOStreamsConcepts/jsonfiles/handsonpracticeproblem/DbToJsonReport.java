package JavaIOStreamsConcepts.jsonfiles.handsonpracticeproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONObject;

public class DbToJsonReport {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "An2*12345";

		JSONArray jsonReport = new JSONArray();

		try {
			// Load driver (optional for newer JDBC)
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employee");

			while (rs.next()) {
				JSONObject emp = new JSONObject();
				emp.put("id", rs.getInt("id"));
				emp.put("name", rs.getString("name"));
				emp.put("department", rs.getString("department"));
				emp.put("salary", rs.getDouble("salary"));

				jsonReport.put(emp);
			}

			// Print JSON Report
			System.out.println(jsonReport.toString(2));

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
