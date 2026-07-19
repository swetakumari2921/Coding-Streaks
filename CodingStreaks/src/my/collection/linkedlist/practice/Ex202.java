package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode68 {
	int data;
	ListNode68 next;

	ListNode68(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex202 {

	public static boolean hasDuplicateCycle(ListNode68 head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode68 slow = head;
		ListNode68 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 0) {
			System.out.println(false);
			sc.close();
			return;
		}

		ListNode68[] nodes = new ListNode68[n];

		for (int i = 0; i < n; i++) {
			nodes[i] = new ListNode68(sc.nextInt());
		}

		for (int i = 0; i < n - 1; i++) {
			nodes[i].next = nodes[i + 1];
		}

		// Enter cycle index (-1 for no cycle)
		int cycleIndex = sc.nextInt();

		if (cycleIndex >= 0 && cycleIndex < n) {
			nodes[n - 1].next = nodes[cycleIndex];
		}

		System.out.println(hasDuplicateCycle(nodes[0]));

		sc.close();
	}
}
