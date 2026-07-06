package my.stack.practice;

import java.util.Stack;

public class Ex08 {

	static void traverseStack(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.println("Stack elements (top to bottom):");

		// Traverse from top to bottom
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		traverseStack(stack);
	}
}
