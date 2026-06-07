package my.collection.linkedlist.practice;

class ListNode31 {
	int data;
	ListNode31 next;

	ListNode31(int data) {
		this.data = data;
	}
}

public class Ex161 {

	static ListNode31 rearrange(ListNode31 head) {

		if (head == null || head.next == null)
			return head;

		// Find middle
		ListNode31 slow = head;
		ListNode31 fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// Split list
		ListNode31 second = slow.next;
		slow.next = null;

		// Reverse second half
		ListNode31 prev = null;
		ListNode31 curr = second;

		while (curr != null) {
			ListNode31 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		second = prev;

		// Merge alternately
		ListNode31 first = head;

		while (second != null) {
			ListNode31 next1 = first.next;
			ListNode31 next2 = second.next;

			first.next = second;
			second.next = next1;

			first = next1;
			second = next2;
		}

		return head;
	}

	static void printList(ListNode31 head) {
		while (head != null) {
			System.out.print(head.data);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode31 head = new ListNode31(1);
		head.next = new ListNode31(2);
		head.next.next = new ListNode31(3);
		head.next.next.next = new ListNode31(4);
		head.next.next.next.next = new ListNode31(5);
		head.next.next.next.next.next = new ListNode31(6);

		System.out.println("Original List:");
		printList(head);

		head = rearrange(head);

		System.out.println("Rearranged List:");
		printList(head);
	}
}
