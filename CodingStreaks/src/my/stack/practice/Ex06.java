package my.stack.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex06 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

		System.out.println("Queue: " + queue);

		// get front element
		int front = queue.peek();

		System.out.println("Front Element = " + front);
		System.out.println("Queue after peek: " + queue);
	}
}
