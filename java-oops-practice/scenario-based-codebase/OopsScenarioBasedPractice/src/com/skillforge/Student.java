package com.skillforge;
public class Student extends User implements ICertifiable {

    private int progress;   // percentage
    private char grade;
    private Course enrolledCourse;

    public Student(int userId, String name, String email) {
        super(userId, name, email);
    }

    public void enroll(Course course) {
        this.enrolledCourse = course;
        this.progress = 0;
        System.out.println(name + " enrolled in " + course.getTitle());
    }

    public void completeModule() {
        progress += 20; // operator usage
        if (progress >= 100) {
            progress = 100;
            assignGrade();
        }
    }

    private void assignGrade() {
        if (progress >= 90)
            grade = 'A';
        else if (progress >= 75)
            grade = 'B';
        else
            grade = 'C';
    }

    @Override
    public String generateCertificate() {
        if (progress < 100) {
            return "Course not completed yet";
        }

        // Polymorphism: certificate varies by course level
        return "Certificate of Completion\n" +
               "Student: " + name +
               "\nCourse: " + enrolledCourse.getTitle() +
               "\nLevel: " + enrolledCourse.getLevel() +
               "\nGrade: " + grade;
    }
}
