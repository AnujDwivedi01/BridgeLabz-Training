package com.skillforge;
public class SkillForgeApp {

    public static void main(String[] args) {

        Instructor instructor = new Instructor(
                101, "Rahul", "rahul@skillforge.com", "Java");

        String[] modules = {"OOP", "Collections", "Streams"};
        Course course = new Course(
                "Advanced Java",
                instructor,
                "Advanced",
                modules
        );

        instructor.uploadCourse(course);

        Student student = new Student(
                201, "Anuj", "anuj@gmail.com");

        student.login();
        student.enroll(course);

        // Completing modules
        for (int i = 0; i < 5; i++) {
            student.completeModule();
        }

        System.out.println(student.generateCertificate());
        student.logout();
    }
}
