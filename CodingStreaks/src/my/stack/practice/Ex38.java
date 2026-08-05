package my.stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class Ex38 {

	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public Ex38() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	// Push element
	public void push(int value) {
		stack.push(value);

		if (minStack.isEmpty() || value <= minStack.peek()) {
			minStack.push(value);
		}
	}

	// Pop element
	public int pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}

		int removed = stack.pop();

		if (removed == minStack.peek()) {
			minStack.pop();
		}

		return removed;
	}

	// Peek element
	public int peek() {
		if (stack.isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}

		return stack.peek();
	}

	// Get minimum element
	public int getMin() {
		if (minStack.isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}

		return minStack.peek();
	}

	// Display stack
	public void display() {
		System.out.println("Stack: " + stack);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ex38 minStack = new Ex38();

		while (true) {

			System.out.println("\n1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Get Minimum");
			System.out.println("5. Display");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter element: ");
				int value = sc.nextInt();
				minStack.push(value);
				break;

			case 2:
				System.out.println("Popped: " + minStack.pop());
				break;

			case 3:
				System.out.println("Top Element: " + minStack.peek());
				break;

			case 4:
				System.out.println("Minimum Element: " + minStack.getMin());
				break;

			case 5:
				minStack.display();
				break;

			case 6:
				System.out.println("Program Ended.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}