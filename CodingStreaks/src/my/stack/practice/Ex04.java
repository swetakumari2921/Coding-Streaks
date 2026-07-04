package my.stack.practice;

import java.util.Stack;

public class Ex04 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Original Stack: " + stack);

		if (!stack.isEmpty()) {
			int poppedElement = stack.pop();
			System.out.println("Popped Element: " + poppedElement);
		} else {
			System.out.println("Stack is Empty");
		}

		System.out.println("Stack after pop: " + stack);
	}
}
