package JavaIOStreamsConcepts.csvfiles.sortsalarybycsv;

public class Employee {

	private int id;
	private String name;
	private String department;
	private int salary;

	public Employee(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
	}
}
