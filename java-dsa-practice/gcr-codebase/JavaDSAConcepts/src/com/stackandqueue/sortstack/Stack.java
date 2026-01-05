package com.stackandqueue.sortstack;

class Stack {
	private StackNode top;

	// Push operation
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
	}

	// Pop operation
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int value = top.data;
		top = top.next;
		return value;
	}

	// Peek operation
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return top.data;
	}

	// Check empty
	public boolean isEmpty() {
		return top == null;
	}

	// Display stack
	public void display() {
		StackNode temp = top;
		System.out.print("Stack (Top → Bottom): ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
