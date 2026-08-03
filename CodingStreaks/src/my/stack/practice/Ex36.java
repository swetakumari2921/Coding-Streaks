package my.stack.practice;

import java.util.Stack;

public class Ex36 {

	public static void deleteMiddle(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int middle = stack.size() / 2;
		deleteMiddleHelper(stack, middle);
	}

	private static void deleteMiddleHelper(Stack<Integer> stack, int middle) {

		// Middle element reached
		if (middle == 0) {
			stack.pop();
			return;
		}

		int top = stack.pop();

		deleteMiddleHelper(stack, middle - 1);

		stack.push(top);
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("Original Stack: " + stack);

		deleteMiddle(stack);

		System.out.println("Stack after deleting middle element: " + stack);
	}
}
