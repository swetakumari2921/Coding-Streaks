package my.queue.practice;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class Ex18 {

	public static void reverseFirstK(Queue<Integer> queue, int k) {

		if (k > queue.size() || k <= 0) {
			return;
		}

		Stack<Integer> stack = new Stack<>();

		// Remove first k elements and push into stack
		for (int i = 0; i < k; i++) {
			stack.push(queue.poll());
		}

		// Add reversed elements back
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		// Move remaining elements to back
		int remaining = queue.size() - k;
		for (int i = 0; i < remaining; i++) {
			queue.add(queue.poll());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();

		System.out.print("Enter size of queue: ");
		int n = sc.nextInt();

		System.out.println("Enter queue elements:");
		for (int i = 0; i < n; i++) {
			queue.add(sc.nextInt());
		}

		System.out.print("Enter K: ");
		int k = sc.nextInt();

		reverseFirstK(queue, k);

		System.out.println("Queue after reversing first K elements:");
		for (int element : queue) {
			System.out.print(element + " ");
		}

		sc.close();
	}
}
