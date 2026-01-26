package JavaIOStreamsConcepts.csvfiles;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeCSVReport {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/companydb";
		String username = "root";
		String password = "An2*!2345";

		String csvFile = "D:\\CSV_files\\employessss.csv";

		try (Connection con = DriverManager.getConnection(dbUrl, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT emp_id, name, department, salary FROM employees");
				FileWriter fw = new FileWriter(csvFile)) {

			// Write CSV Header
			fw.write("Employee ID,Name,Department,Salary\n");

			// Write Records
			while (rs.next()) {
				fw.write(rs.getInt("emp_id") + "," + rs.getString("name") + "," + rs.getString("department") + ","
						+ rs.getDouble("salary") + "\n");
			}

			System.out.println("CSV Report Generated Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
