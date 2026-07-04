package my.stack.practice;

import java.util.Stack;

public class Ex06 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack: " + stack);

		// check if empty
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Stack is NOT Empty");
		}

		// pop all elements
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("After popping all elements");

		if (stack.isEmpty()) {
			System.out.println("Stack is Empty now");
		} else {
			System.out.println("Stack is NOT Empty");
		}
	}
}
