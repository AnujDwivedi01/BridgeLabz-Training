package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	// Push operation
	public void push(int x) {

		// Step 1: Add element to empty q2
		q2.add(x);

		// Step 2: Move all elements from q1 to q2
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		// Step 3: Swap q1 and q2
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Pop operation
	public int pop() {

		if (q1.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		return q1.remove();
	}

	// Top operation
	public int top() {

		if (q1.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		return q1.peek();
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return q1.isEmpty();
	}

	public static void main(String[] args) {

		StackUsingQueues stack = new StackUsingQueues();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Pop: " + stack.pop()); // 3
		System.out.println("Top: " + stack.top()); // 2
	}
}
