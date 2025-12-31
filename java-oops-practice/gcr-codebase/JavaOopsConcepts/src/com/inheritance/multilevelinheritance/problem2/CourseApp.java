package com.inheritance.multilevelinheritance.problem2;

public class CourseApp {

    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                10000,
                20
        );

        course.displayCourseDetails();
    }
}
