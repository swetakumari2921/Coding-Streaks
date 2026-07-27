package my.collection.linkedlist.practice;

class ListNode77 {
	int data;
	ListNode77 next;

	ListNode77(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex211 {

	public static ListNode77 deleteKthNode(ListNode77 head, int k) {
		if (head == null) {
			return null;
		}

		// Single node
		if (head.next == head) {
			return (k == 1) ? null : head;
		}

		// Delete head node
		if (k == 1) {
			ListNode77 last = head;
			while (last.next != head) {
				last = last.next;
			}
			last.next = head.next;
			head = head.next;
			return head;
		}

		// Move to (k-1)th node
		ListNode77 current = head;
		for (int i = 1; i < k - 1 && current.next != head; i++) {
			current = current.next;
		}

		// Delete kth node if it exists
		if (current.next != head) {
			current.next = current.next.next;
		}

		return head;
	}

	public static void display(ListNode77 head) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		ListNode77 temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode77 head = new ListNode77(10);
		ListNode77 second = new ListNode77(20);
		ListNode77 third = new ListNode77(30);
		ListNode77 fourth = new ListNode77(40);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = head;

		System.out.println("Original Circular Linked List:");
		display(head);

		int k = 3;
		head = deleteKthNode(head, k);

		System.out.println("After deleting " + k + "rd node:");
		display(head);
	}
}
