package my.stack.practice;

import java.util.Stack;

public class Ex40 {

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public Ex40() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	// Enqueue operation (add element)
	public void enqueue(int value) {
		stack1.push(value);
		System.out.println(value + " added to queue");
	}

	// Dequeue operation (remove element)
	public int dequeue() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		// Move elements from stack1 to stack2
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.pop();
	}

	// Peek front element
	public int peek() {

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

	// Display queue
	public void display() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		Stack<Integer> temp1 = new Stack<>();
		Stack<Integer> temp2 = new Stack<>();

		temp1.addAll(stack1);
		temp2.addAll(stack2);

		while (!temp2.isEmpty()) {
			System.out.print(temp2.pop() + " ");
		}

		while (!temp1.isEmpty()) {
			temp2.push(temp1.pop());
		}

		while (!temp2.isEmpty()) {
			System.out.print(temp2.pop() + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Ex40 queue = new Ex40();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.print("Queue: ");
		queue.display();

		System.out.println("Removed: " + queue.dequeue());

		System.out.print("Queue after dequeue: ");
		queue.display();

		System.out.println("Front element: " + queue.peek());

		queue.enqueue(40);

		System.out.print("Final Queue: ");
		queue.display();
	}
}
