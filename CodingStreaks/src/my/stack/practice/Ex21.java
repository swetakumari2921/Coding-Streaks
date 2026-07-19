package my.stack.practice;

import java.util.Stack;
import java.util.Scanner;

class MinStack {

	Stack<Integer> stack;
	Stack<Integer> minStack;

	MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	// Push element
	public void push(int x) {
		stack.push(x);

		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
	}

	// Remove top element
	public void pop() {
		if (stack.isEmpty()) {
			return;
		}

		int removed = stack.pop();

		if (removed == minStack.peek()) {
			minStack.pop();
		}
	}

	// Get top element
	public int top() {
		return stack.peek();
	}

	// Get minimum element
	public int getMin() {
		return minStack.peek();
	}
}

public class Ex21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MinStack ms = new MinStack();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			ms.push(sc.nextInt());
		}

		System.out.println("Top: " + ms.top());
		System.out.println("Minimum: " + ms.getMin());

		ms.pop();

		System.out.println("After pop:");
		System.out.println("Top: " + ms.top());
		System.out.println("Minimum: " + ms.getMin());

		sc.close();
	}
}
