package my.stack.practice;

import java.util.Stack;

public class Ex33 {

	// Insert element at bottom of stack
	public static void insertAtBottom(Stack<Integer> stack, int value) {
		if (stack.isEmpty()) {
			stack.push(value);
			return;
		}

		int top = stack.pop();
		insertAtBottom(stack, value);
		stack.push(top);
	}

	// Reverse stack using recursion
	public static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int top = stack.pop();

		reverseStack(stack);

		insertAtBottom(stack, top);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Original Stack: " + stack);

		reverseStack(stack);

		System.out.println("Reversed Stack: " + stack);
	}
}
