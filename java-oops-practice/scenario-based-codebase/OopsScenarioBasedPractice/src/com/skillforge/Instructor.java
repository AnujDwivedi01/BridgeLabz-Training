package com.skillforge;
public class Instructor extends User {

    private String expertise;

    public Instructor(int userId, String name, String email, String expertise) {
        super(userId, name, email);
        this.expertise = expertise;
    }

    public void uploadCourse(Course course) {
        System.out.println(name + " uploaded course: " + course.getTitle());
    }
}
