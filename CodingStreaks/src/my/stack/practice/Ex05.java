package my.stack.practice;

import java.util.Stack;

public class Ex05 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);

		System.out.println("Stack: " + stack);

		if (!stack.isEmpty()) {
			int topElement = stack.peek();
			System.out.println("Top Element (Peek): " + topElement);
		} else {
			System.out.println("Stack is Empty");
		}
	}
}
