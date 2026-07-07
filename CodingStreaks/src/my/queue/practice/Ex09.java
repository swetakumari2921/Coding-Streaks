package my.queue.practice;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Ex09 {

	static void reverseQueue(Queue<Integer> queue) {

		Stack<Integer> stack = new Stack<>();

		// Remove elements from queue and push into stack
		while (!queue.isEmpty()) {
			stack.push(queue.poll());
		}

		// Add elements back from stack to queue
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		System.out.println("Original Queue: " + queue);

		reverseQueue(queue);

		System.out.println("Reversed Queue: " + queue);
	}
}
