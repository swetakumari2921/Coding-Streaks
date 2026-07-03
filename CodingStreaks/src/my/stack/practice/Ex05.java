package my.stack.practice;

import java.util.Stack;

public class Ex05 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Stack before pop: " + stack);

		// pop operation
		int poppedElement = stack.pop();

		System.out.println("Popped Element = " + poppedElement);
		System.out.println("Stack after pop: " + stack);
	}
}
