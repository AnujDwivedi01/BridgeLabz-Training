package com.objectmodeling;

public class UniversityApp {

    // Course class
    static class Course {
        private String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }
    }

    // Student class
    static class Student {
        private String studentName;

        public Student(String studentName) {
            this.studentName = studentName;
        }

        public void enrollCourse(Course course) {
            System.out.println(studentName + " enrolled in " + course.getCourseName());
        }
    }

    // Professor class
    static class Professor {
        private String professorName;

        public Professor(String professorName) {
            this.professorName = professorName;
        }

        public void assignProfessor(Course course) {
            System.out.println(professorName + " is teaching " + course.getCourseName());
        }
    }

    // Main method
    public static void main(String[] args) {

        Course course = new Course("Java Programming");

        Student student = new Student("Rahul");
        Professor professor = new Professor("Dr. Singh");

        student.enrollCourse(course);
        professor.assignProfessor(course);
    }
}
