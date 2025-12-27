package com.constructor.levelone;

public class PersonDriver {

	public static void main(String[] args) {
		Person p1 = new Person("Anuj", 22);
        Person p2 = new Person(p1); // Cloning

        p1.display();
        p2.display();

	}

}
