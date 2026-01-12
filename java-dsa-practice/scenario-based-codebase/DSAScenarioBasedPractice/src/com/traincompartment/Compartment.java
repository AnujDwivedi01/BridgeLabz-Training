package com.traincompartment;

public class Compartment {
	String name;
	Compartment next;
	Compartment prev;

	public Compartment(String name) {
		this.name = name;
		this.next = null;
		this.prev = null;
	}
	

}
