package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex38 {

	private Queue<Integer> queue;
	private int capacity;

	public Ex38(int capacity) {
			this.capacity = capacity;
			queue = new LinkedList<>();
		}

	// Access element in cache
	public void refer(int page) {

		// If element already exists, remove it
		if (queue.contains(page)) {
			queue.remove(page);
		}

		// If cache is full remove least recently used element
		else if (queue.size() == capacity) {
			int removed = queue.poll();
			System.out.println("Removed LRU element: " + removed);
		}

		// Add recently used element at rear
		queue.offer(page);

		System.out.println("Cache after access: " + queue);
	}

	// Display cache
	public void display() {
		System.out.println("Current Cache: " + queue);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter cache capacity: ");
		int capacity = sc.nextInt();

		Ex38 lru = new Ex38(capacity);

		while (true) {

			System.out.println("\n1. Access Page");
			System.out.println("2. Display Cache");
			System.out.println("3. Exit");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter page number: ");
				int page = sc.nextInt();
				lru.refer(page);
				break;

			case 2:
				lru.display();
				break;

			case 3:
				System.out.println("Program Ended.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
