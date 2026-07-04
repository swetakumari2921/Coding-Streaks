package my.stack.practice;

import java.util.Stack;

public class Ex07 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Stack: " + stack);

		if (!stack.isEmpty()) {
			int top = stack.peek();
			System.out.println("Top Element: " + top);
		} else {
			System.out.println("Stack is Empty");
		}
	}
}
