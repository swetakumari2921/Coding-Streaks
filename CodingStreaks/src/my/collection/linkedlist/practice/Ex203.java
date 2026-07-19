package my.collection.linkedlist.practice;

import java.util.HashSet;
import java.util.Scanner;

class ListNode69 {
	int data;
	ListNode69 next;

	ListNode69(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex203 {

	public static ListNode69 findLoopStart(ListNode69 head) {
		HashSet<ListNode69> visited = new HashSet<>();

		ListNode69 current = head;

		while (current != null) {
			if (visited.contains(current)) {
				return current; // Loop starting node
			}

			visited.add(current);
			current = current.next;
		}

		return null; // No loop
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ListNode69[] nodes = new ListNode69[n];

		for (int i = 0; i < n; i++) {
			nodes[i] = new ListNode69(sc.nextInt());
		}

		for (int i = 0; i < n - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}

		int loopIndex = sc.nextInt();

		if (loopIndex >= 0 && loopIndex < n) {
			nodes[n - 1].next = nodes[loopIndex];
		}

		ListNode69 result = findLoopStart(nodes[0]);

		if (result != null)
			System.out.println(result.data);
		else
			System.out.println("No Loop");

		sc.close();
	}
}
