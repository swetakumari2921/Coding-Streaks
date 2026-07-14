package my.queue.practice;

import java.util.Stack;

public class Ex16 {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	// Enqueue operation
	void enqueue(int data) {

		stack1.push(data);
		System.out.println(data + " inserted");
	}

	// Dequeue operation
	int dequeue() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue Underflow");
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
	int peek() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
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

public class Ex190 {

	public static void main(String[] args) {

		QueueUsingStack queue = new QueueUsingStack();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Removed: " + queue.dequeue());
		System.out.println("Front: " + queue.peek());
		System.out.println("Is Empty: " + queue.isEmpty());
	}
}
