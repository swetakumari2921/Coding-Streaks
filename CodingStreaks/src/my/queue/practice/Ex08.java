package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex08 {

	static void traverseQueue(Queue<Integer> queue) {

		if (queue.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Queue elements (front to rear):");

		// Traverse without removing elements
		for (Integer val : queue) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

		traverseQueue(queue);
	}
}
