package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex03 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		System.out.println("Performing Enqueue operations...");

		// enqueue (insert elements)
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		System.out.println("Queue after enqueue: " + queue);

		// one more enqueue
		queue.offer(50);

		System.out.println("Queue after inserting 50: " + queue);
	}
}
