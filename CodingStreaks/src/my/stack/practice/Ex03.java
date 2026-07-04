package my.stack.practice;

import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		// pushing elements into stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Stack after push operations: " + stack);

		// push one more element
		stack.push(50);

		System.out.println("Stack after pushing 50: " + stack);
	}
}
