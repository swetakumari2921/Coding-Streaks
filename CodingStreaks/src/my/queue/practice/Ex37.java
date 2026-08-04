package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex37 {

	private Queue<Integer> queue;
	private static final int WINDOW = 300;

	public Ex37() {
	        queue = new LinkedList<>();
	    }

	// Record a hit at given timestamp
	public void hit(int timestamp) {
		queue.offer(timestamp);
	}

	// Get number of hits in last 5 minutes
	public int getHits(int timestamp) {

		// Remove hits older than 300 seconds
		while (!queue.isEmpty() && timestamp - queue.peek() >= WINDOW) {
			queue.poll();
		}

		return queue.size();
	}

	public static void main(String[] args) {

		Ex37 counter = new Ex37();

		counter.hit(1);
		counter.hit(2);
		counter.hit(3);

		System.out.println("Hits at timestamp 4: " + counter.getHits(4));

		counter.hit(301);

		System.out.println("Hits at timestamp 301: " + counter.getHits(301));
	}
}
