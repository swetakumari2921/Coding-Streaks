package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Queue;

class ListNode61 {
	int data;
	ListNode61 next;
	ListNode61 child;

	ListNode61(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

public class Ex197 {

	static ListNode61 flattenBFS(ListNode61 head) {

		if (head == null)
			return null;

		Queue<ListNode61> queue = new LinkedList<>();
		ListNode61 current = head;

		while (current != null) {

			if (current.child != null) {
				queue.offer(current.child);
				current.child = null;
			}

			if (current.next == null && !queue.isEmpty()) {
				current.next = queue.poll();
			}

			current = current.next;
		}

		return head;
	}

	static void printList(ListNode61 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode61 head = new ListNode61(1);
		head.next = new ListNode61(2);
		head.next.next = new ListNode61(3);
		head.next.next.next = new ListNode61(4);

		head.next.child = new ListNode61(5);
		head.next.child.next = new ListNode61(6);

		head.next.next.child = new ListNode61(7);
		head.next.next.child.next = new ListNode61(8);

		head.next.child.child = new ListNode61(9);

		System.out.println("Flattened List (BFS):");
		head = flattenBFS(head);
		printList(head);
	}
}
