package my.collection.linkedlist.practice;

class ListNode41 {
	int data;
	ListNode41 next;

	ListNode41(int data) {
		this.data = data;
	}
}

public class Ex173 {

	public static ListNode41 bubbleSort(ListNode41 head) {
		if (head == null || head.next == null) {
			return head;
		}

		boolean swapped;

		do {
			swapped = false;
			ListNode41 current = head;

			while (current != null && current.next != null) {
				if (current.data > current.next.data) {
					int temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;
					swapped = true;
				}
				current = current.next;
			}
		} while (swapped);

		return head;
	}

	public static void printList(ListNode41 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode41 head = new ListNode41(7);
		head.next = new ListNode41(3);
		head.next.next = new ListNode41(9);
		head.next.next.next = new ListNode41(1);
		head.next.next.next.next = new ListNode41(5);

		System.out.println("Original List:");
		printList(head);

		head = bubbleSort(head);

		System.out.println("Sorted List:");
		printList(head);
	}
}
