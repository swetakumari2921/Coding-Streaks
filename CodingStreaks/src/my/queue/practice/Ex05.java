package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		System.out.println("Queue: " + queue);

		// front element (peek)
		if (!queue.isEmpty()) {
			int frontElement = queue.peek();
			System.out.println("Front Element: " + frontElement);
		} else {
			System.out.println("Queue is Empty");
		}
	}
}
