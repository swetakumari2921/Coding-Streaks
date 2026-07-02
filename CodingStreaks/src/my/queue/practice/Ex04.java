package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04 {

	static void dequeueElement(Queue<Integer> queue) {

		if (queue.isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return;
		}

		int removed = queue.remove(); // or queue.poll()
		System.out.println("Removed element: " + removed);
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

		System.out.println("Original Queue: " + queue);

		dequeueElement(queue);
		dequeueElement(queue);

		System.out.println("Queue after dequeue operations: " + queue);
	}
}
