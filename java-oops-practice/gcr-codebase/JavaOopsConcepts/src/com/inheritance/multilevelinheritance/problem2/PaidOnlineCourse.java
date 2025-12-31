package com.inheritance.multilevelinheritance.problem2;

class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount; // discount in percentage

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " hours");
        System.out.println("Platform      : " + platform);
        System.out.println("Recorded      : " + (isRecorded ? "Yes" : "No"));
        System.out.println("Course Fee    : ₹" + fee);
        System.out.println("Discount      : " + discount + "%");
        System.out.println("Final Price   : ₹" + (fee - (fee * discount / 100)));
    }
}
