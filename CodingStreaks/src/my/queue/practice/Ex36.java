package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex36 {

	static class MovingAverage {

		private Queue<Integer> queue;
		private int size;
		private double sum;

		MovingAverage(int size) {
			this.size = size;
			queue = new LinkedList<>();
			sum = 0;
		}

		public double next(int value) {

			// Add new value
			queue.offer(value);
			sum += value;

			// Remove oldest value if window exceeds size
			if (queue.size() > size) {
				sum -= queue.poll();
			}

			return sum / queue.size();
		}
	}

	public static void main(String[] args) {

		MovingAverage ma = new MovingAverage(3);

		System.out.println(ma.next(1));
		System.out.println(ma.next(10));
		System.out.println(ma.next(3));
		System.out.println(ma.next(5));
		System.out.println(ma.next(6));
	}
}
