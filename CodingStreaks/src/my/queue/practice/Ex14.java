package my.queue.practice;

import java.util.Queue;
import java.util.LinkedList;

public class Ex14 {

	static class MyQueue {

		Queue<Integer> queue;
		int capacity;

		MyQueue(int capacity) {
			this.capacity = capacity;
			queue = new LinkedList<>();
		}

		// Check overflow before enqueue
		void enqueue(int value) {

			if (queue.size() == capacity) {
				System.out.println("Queue Overflow! Cannot insert " + value);
				return;
			}

			queue.add(value);
			System.out.println(value + " inserted");
		}

		void display() {
			System.out.println("Queue: " + queue);
		}
	}

	public static void main(String[] args) {

		MyQueue q = new MyQueue(3);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		// Overflow condition
		q.enqueue(40);

		q.display();
	}
}
