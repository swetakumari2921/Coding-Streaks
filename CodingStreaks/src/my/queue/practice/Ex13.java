package my.queue.practice;

import java.util.Queue;
import java.util.LinkedList;

public class Ex13 {

	static void deleteElement(Queue<Integer> queue) {

		if (queue.isEmpty()) {
			System.out.println("Queue is empty. Deletion not possible.");
			return;
		}

		int removed = queue.remove();

		System.out.println("Deleted element: " + removed);
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		// Insert elements
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

		System.out.println("Queue before deletion: " + queue);

		deleteElement(queue);

		System.out.println("Queue after deletion: " + queue);
	}
}
