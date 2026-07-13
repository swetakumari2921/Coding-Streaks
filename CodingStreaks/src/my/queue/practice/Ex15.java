package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex15 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		if (queue.isEmpty()) {
			System.out.println("Queue Underflow! Queue is empty.");
		} else {
			System.out.println("Removed Element: " + queue.poll());
		}

		queue.offer(10);
		queue.offer(20);

		System.out.println("Queue: " + queue);

		queue.poll();
		queue.poll();

		if (queue.isEmpty()) {
			System.out.println("Queue Underflow! Queue is empty.");
		} else {
			System.out.println("Removed Element: " + queue.poll());
		}
	}
}
