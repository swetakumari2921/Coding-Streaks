package my.stack.practice;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {

		String str = "Hello";

		Stack<Character> stack = new Stack<>();

		// Push each character into stack
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}

		System.out.print("Reversed String: ");

		// Pop characters from stack
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
