package my.collection.linkedlist.practice;

import java.util.HashMap;

class ListNode66 {
	int data;
	ListNode66 next;
	ListNode66 random;
	ListNode66 child;

	ListNode66(int data) {
		this.data = data;
		this.next = null;
		this.random = null;
		this.child = null;
	}
}

public class Ex200 {

	public static ListNode66 cloneLinkedList(ListNode66 head) {
		if (head == null)
			return null;

		HashMap<ListNode66, ListNode66> map = new HashMap<>();

		// Create copy of each node
		ListNode66 curr = head;
		while (curr != null) {
			map.put(curr, new ListNode66(curr.data));
			curr = curr.next;
		}

		// Assign next, random, and child pointers
		curr = head;
		while (curr != null) {
			ListNode66 clone = map.get(curr);

			clone.next = map.get(curr.next);
			clone.random = map.get(curr.random);
			clone.child = map.get(curr.child);

			curr = curr.next;
		}

		return map.get(head);
	}

	public static void printList(ListNode66 head) {
		ListNode66 curr = head;

		while (curr != null) {
			System.out.print("Node: " + curr.data);

			System.out.print(" Next: ");
			System.out.print(curr.next != null ? curr.next.data : "null");

			System.out.print(" Random: ");
			System.out.print(curr.random != null ? curr.random.data : "null");

			System.out.print(" Child: ");
			System.out.print(curr.child != null ? curr.child.data : "null");

			System.out.println();

			curr = curr.next;
		}
	}

	public static void main(String[] args) {

		ListNode66 head = new ListNode66(1);
		head.next = new ListNode66(2);
		head.next.next = new ListNode66(3);

		// Random pointers
		head.random = head.next.next; // 1 -> 3
		head.next.random = head; // 2 -> 1
		head.next.next.random = head.next; // 3 -> 2

		// Child pointers
		head.child = head.next; // 1 -> 2
		head.next.child = head.next.next; // 2 -> 3

		System.out.println("Cloned Linked List:");

		ListNode66 clonedHead = cloneLinkedList(head);

		printList(clonedHead);
	}
}
