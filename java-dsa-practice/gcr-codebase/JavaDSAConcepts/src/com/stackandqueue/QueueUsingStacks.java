package com.stackandqueue;

import java.util.Stack;

public class QueueUsingStacks{

	private Stack<Integer> inStack;
	private Stack<Integer> outStack;

	// Constructor
	public QueueUsingStacks() {
		inStack = new Stack<>();
		outStack = new Stack<>();
	}

	// Enqueue operation
	public void enqueue(int data) {
		inStack.push(data);
		System.out.println(data + " enqueued");
	}

	// Dequeue operation
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		// Transfer elements if outStack is empty
		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}

		return outStack.pop();
	}

	// Check if queue is empty
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}

	// Display front element
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}

		return outStack.peek();
	}

	// Main method for testing
	public static void main(String[] args) {
		QueueUsingStacks queue = new QueueUsingStacks();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Front element: " + queue.peek());
		System.out.println("Dequeued: " + queue.dequeue());
	}
}
