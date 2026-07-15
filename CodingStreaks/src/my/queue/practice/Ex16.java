package my.queue.practice;

import java.util.Stack;

import java.util.Stack;

class QueueUsingStack {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	// Enqueue operation
	void enqueue(int data) {
		stack1.push(data);
	}

	// Dequeue operation
	int dequeue() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.pop();
	}

	// Front element
	int front() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.peek();
	}

	// Check empty
	boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}

public class Ex16 {

	public static void main(String[] args) {

		QueueUsingStack queue = new QueueUsingStack();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Front element: " + queue.front());

		System.out.println("Removed: " + queue.dequeue());
		System.out.println("Removed: " + queue.dequeue());

		System.out.println("Is Queue Empty? " + queue.isEmpty());
	}
}
