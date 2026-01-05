package com.stackandqueue.sortstack;

public class Main {
	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(30);
		stack.push(10);
		stack.push(50);
		stack.push(20);

		System.out.println("Before Sorting:");
		stack.display();

		StackSorter.sortStack(stack);

		System.out.println("After Sorting:");
		stack.display();
	}
}