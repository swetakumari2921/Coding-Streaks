package my.stack.practice;

import java.util.Stack;

public class Ex22 {

	Stack<Integer> stack;
	Stack<Integer> maxStack;

	Ex22() {
	        stack = new Stack<>();
	        maxStack = new Stack<>();
	    }

	// Push element
	public void push(int value) {

		stack.push(value);

		if (maxStack.isEmpty() || value >= maxStack.peek()) {
			maxStack.push(value);
		} else {
			maxStack.push(maxStack.peek());
		}
	}

	// Remove top element
	public int pop() {

		if (stack.isEmpty()) {
			return -1;
		}

		maxStack.pop();
		return stack.pop();
	}

	// Get maximum element
	public int getMax() {

		if (maxStack.isEmpty()) {
			return -1;
		}

		return maxStack.peek();
	}

	public static void main(String[] args) {

		Ex22 ms = new Ex22();

		ms.push(10);
		ms.push(20);
		ms.push(5);
		ms.push(30);

		System.out.println("Maximum Element: " + ms.getMax());

		ms.pop();

		System.out.println("Maximum Element after pop: " + ms.getMax());
	}
}
