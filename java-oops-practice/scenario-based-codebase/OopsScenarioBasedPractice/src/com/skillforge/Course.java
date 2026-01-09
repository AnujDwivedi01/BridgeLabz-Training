package com.skillforge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    private List<String> reviews = new ArrayList<>();
    private String level;

    // Constructor with default modules
    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new String[]{"Intro", "Basics", "Advanced"};
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String level, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
    }

    public String getTitle() {
        return title;
    }

    public String[] getModules() {
        return modules;
    }

    public double getRating() {
        return rating;
    }

    public String getLevel() {
        return level;
    }

    // Read-only access
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public void addReview(String review, int stars) {
        reviews.add(review);
        calculateRating(stars);
    }

    // Protected rating logic
    protected void calculateRating(int stars) {
        rating = (rating + stars) / 2;
    }
}
