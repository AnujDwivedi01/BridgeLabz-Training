package com.stackandqueue.sortstack;

class StackSorter {

	// Insert element in sorted position
	public static void sortedInsert(Stack stack, int element) {

		if (stack.isEmpty() || stack.peek() <= element) {
			stack.push(element);
			return;
		}

		int temp = stack.pop();
		sortedInsert(stack, element);
		stack.push(temp);
	}

	// Sort stack using recursion
	public static void sortStack(Stack stack) {

		if (!stack.isEmpty()) {
			int temp = stack.pop();
			sortStack(stack);
			sortedInsert(stack, temp);
		}
	}
}
