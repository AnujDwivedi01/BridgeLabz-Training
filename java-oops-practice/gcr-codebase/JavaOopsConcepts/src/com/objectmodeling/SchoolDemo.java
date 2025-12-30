package com.objectmodeling;
import java.util.ArrayList;

 class Course {

    private String courseName;
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Show enrolled students
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in course: " + courseName);
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}



 class Student {

    private String name;
    private ArrayList<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // association
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}



 class School {

    private String schoolName;
    private ArrayList<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display students of school
    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}



public class SchoolDemo {
	
	 public static void main(String[] args) {

	        // Create School
	        School school = new School("Green Valley School");

	        // Create Students
	        Student s1 = new Student("Anuj");
	        Student s2 = new Student("Rahul");

	        // Create Courses
	        Course c1 = new Course("Java");
	        Course c2 = new Course("Python");

	        // Aggregation: School has students
	        school.addStudent(s1);
	        school.addStudent(s2);

	        // Association: Students enroll in courses
	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);

	        s2.enrollCourse(c1);

	        // Display details
	        school.showStudents();
	        System.out.println();

	        s1.viewCourses();
	        System.out.println();

	        c1.showEnrolledStudents();
	    }

}
