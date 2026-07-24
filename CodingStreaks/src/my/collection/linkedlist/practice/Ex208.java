package my.collection.linkedlist.practice;

class ListNode74 {
	int data;
	ListNode74 next;

	ListNode74(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex208 {

	// Breaks a circular linked list into a linear linked list
	public static ListNode74 breakCircular(ListNode74 head) {
		if (head == null) {
			return null;
		}

		// Single node circular list
		if (head.next == head) {
			head.next = null;
			return head;
		}

		ListNode74 temp = head;

		// Find the last node
		while (temp.next != head) {
			temp = temp.next;
		}

		// Break the circular link
		temp.next = null;

		return head;
	}

	public static void printList(ListNode74 head) {
		ListNode74 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode74 head = new ListNode74(10);
		head.next = new ListNode74(20);
		head.next.next = new ListNode74(30);
		head.next.next.next = new ListNode74(40);

		// Make the list circular
		head.next.next.next.next = head;

		// Break the circular linked list
		head = breakCircular(head);

		// Print the linear linked list
		printList(head);
	}
}
