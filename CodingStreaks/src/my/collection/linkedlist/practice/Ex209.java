package my.collection.linkedlist.practice;

class ListNode75 {
	int data;
	ListNode75 next;

	ListNode75(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex209 {

	// Rotate circular linked list by k positions
	public static ListNode75 rotate(ListNode75 head, int k) {
		if (head == null || head.next == head || k == 0) {
			return head;
		}

		// Find length and last node
		ListNode75 tail = head;
		int length = 1;

		while (tail.next != head) {
			tail = tail.next;
			length++;
		}

		k = k % length;
		if (k == 0) {
			return head;
		}

		// Find new tail
		int steps = length - k;
		ListNode75 newTail = head;

		for (int i = 1; i < steps; i++) {
			newTail = newTail.next;
		}

		ListNode75 newHead = newTail.next;

		// Update circular links
		newTail.next = head;
		tail.next = newHead;

		return newHead;
	}

	public static void print(ListNode75 head, int length) {
		ListNode75 temp = head;

		for (int i = 0; i < length; i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode75 head = new ListNode75(1);
		head.next = new ListNode75(2);
		head.next.next = new ListNode75(3);
		head.next.next.next = new ListNode75(4);
		head.next.next.next.next = new ListNode75(5);

		// Make it circular
		head.next.next.next.next.next = head;

		System.out.println("Original Circular Linked List:");
		print(head, 5);

		head = rotate(head, 2);

		System.out.println("After Rotation:");
		print(head, 5);
	}
}
