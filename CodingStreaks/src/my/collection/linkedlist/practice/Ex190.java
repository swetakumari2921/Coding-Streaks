package my.collection.linkedlist.practice;

class ListNode54 {
	int data;
	ListNode54 next;

	ListNode54(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex190 {

	static int findCycleLength(ListNode54 head) {
		ListNode54 slow = head;
		ListNode54 fast = head;

		// Detect cycle using Floyd's Algorithm
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				int length = 1;
				ListNode54 temp = slow.next;

				while (temp != slow) {
					length++;
					temp = temp.next;
				}

				return length;
			}
		}

		return 0; // No cycle
	}

	public static void main(String[] args) {

		ListNode54 head = new ListNode54(10);
		head.next = new ListNode54(20);
		head.next.next = new ListNode54(30);
		head.next.next.next = new ListNode54(40);
		head.next.next.next.next = new ListNode54(50);

		// Create cycle: 50 -> 30
		head.next.next.next.next.next = head.next.next;

		int length = findCycleLength(head);

		if (length == 0) {
			System.out.println("No cycle found");
		} else {
			System.out.println("Cycle Length = " + length);
		}
	}
}
