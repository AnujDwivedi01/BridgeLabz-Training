package com.inheritance.hierarchicalinheritance.problem2;

public class SchoolApp {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Anuj", 18, "12th Grade");
        Staff staff = new Staff("Ramesh", 35, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}
