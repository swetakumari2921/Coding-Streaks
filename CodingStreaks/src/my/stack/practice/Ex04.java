package my.stack.practice;

import java.util.Stack;

public class Ex04 {

	static void pushElement(Stack<Integer> stack, int value) {
		stack.push(value);
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		pushElement(stack, 10);
		pushElement(stack, 20);
		pushElement(stack, 30);
		pushElement(stack, 40);
		pushElement(stack, 50);

		System.out.println("Stack after push operations: " + stack);
	}
}
