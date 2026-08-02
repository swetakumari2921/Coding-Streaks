package my.stack.practice;

import java.util.Stack;

public class Ex35 {

	static void insertAtBottom(Stack<Integer> stack, int element) {

		// If stack is empty, push element
		if (stack.isEmpty()) {
			stack.push(element);
			return;
		}

		// Remove top element
		int top = stack.pop();

		// Recursive call
		insertAtBottom(stack, element);

		// Put removed element back
		stack.push(top);
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Before insertion: " + stack);

		insertAtBottom(stack, 5);

		System.out.println("After insertion: " + stack);
	}
}
