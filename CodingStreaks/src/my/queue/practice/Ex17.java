package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {

	Queue<Integer> queue = new LinkedList<>();

	// Push operation
	void push(int data) {

		queue.add(data);

		// Move previous elements behind the new element
		int size = queue.size();

		for (int i = 0; i < size - 1; i++) {
			queue.add(queue.remove());
		}
	}

	// Pop operation
	int pop() {

		if (queue.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		return queue.remove();
	}

	// Peek operation
	int peek() {

		if (queue.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		return queue.peek();
	}

	// Check empty
	boolean isEmpty() {
		return queue.isEmpty();
	}
}

public class Ex17 {

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top element: " + stack.peek());

		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());

		System.out.println("Is Stack Empty? " + stack.isEmpty());
	}
}
