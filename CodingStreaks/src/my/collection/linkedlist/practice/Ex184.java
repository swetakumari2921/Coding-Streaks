package my.collection.linkedlist.practice;

class ListNode49 {
	int data;
	ListNode49 next;

	ListNode49(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex184 {

	static ListNode49 reverseKGroup(ListNode49 head, int k) {
		if (head == null || k <= 1)
			return head;

		ListNode49 current = head;
		int count = 0;

		// Check if there are at least k nodes
		while (current != null && count < k) {
			current = current.next;
			count++;
		}

		if (count < k)
			return head;

		current = head;
		ListNode49 prev = null;
		ListNode49 next = null;
		count = 0;

		// Reverse first k nodes
		while (current != null && count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		// Recursively reverse remaining list
		if (next != null) {
			head.next = reverseKGroup(next, k);
		}

		return prev;
	}

	static void printList(ListNode49 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode49 head = new ListNode49(1);
		head.next = new ListNode49(2);
		head.next.next = new ListNode49(3);
		head.next.next.next = new ListNode49(4);
		head.next.next.next.next = new ListNode49(5);
		head.next.next.next.next.next = new ListNode49(6);

		int k = 2;

		System.out.print("Original List: ");
		printList(head);

		head = reverseKGroup(head, k);

		System.out.print("After Reversing in Groups of " + k + ": ");
		printList(head);
	}
}
