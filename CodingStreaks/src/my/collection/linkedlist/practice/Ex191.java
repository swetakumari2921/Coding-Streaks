package my.collection.linkedlist.practice;

class ListNode55 {
	int data;
	ListNode55 next;

	ListNode55(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex191 {

	// Remove cycle without extra space
	static void removeCycle(ListNode55 head) {

		ListNode55 slow = head;
		ListNode55 fast = head;

		// Detect cycle
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {

				// Move slow to head
				slow = head;

				// If cycle starts at head
				if (slow == fast) {
					while (fast.next != slow) {
						fast = fast.next;
					}
				} else {
					while (slow.next != fast.next) {
						slow = slow.next;
						fast = fast.next;
					}
				}

				// Remove cycle
				fast.next = null;
				return;
			}
		}
	}

	// Print linked list
	static void display(ListNode55 head) {
		ListNode55 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode55 head = new ListNode55(1);
		head.next = new ListNode55(2);
		head.next.next = new ListNode55(3);
		head.next.next.next = new ListNode55(4);
		head.next.next.next.next = new ListNode55(5);

		// Create cycle: 5 -> 3
		head.next.next.next.next.next = head.next.next;

		removeCycle(head);

		System.out.println("Linked List after removing cycle:");
		display(head);
	}
}
