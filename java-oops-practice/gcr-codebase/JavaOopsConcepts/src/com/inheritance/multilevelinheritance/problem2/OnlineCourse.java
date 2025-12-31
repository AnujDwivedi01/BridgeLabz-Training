package com.inheritance.multilevelinheritance.problem2;

class OnlineCourse extends Course {

    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
