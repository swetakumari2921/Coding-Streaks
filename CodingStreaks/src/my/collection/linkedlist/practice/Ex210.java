package my.collection.linkedlist.practice;

class ListNode76 {
	int data;
	ListNode76 next;

	ListNode76(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex210 {

	// Function to find the middle node of a circular linked list
	public static ListNode76 findMiddle(ListNode76 head) {
		if (head == null) {
			return null;
		}

		ListNode76 slow = head;
		ListNode76 fast = head;

		// Move slow by 1 step and fast by 2 steps
		while (fast.next != head && fast.next.next != head) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	// Function to display the circular linked list
	public static void display(ListNode76 head) {
		if (head == null) {
			return;
		}

		ListNode76 temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);

		System.out.println();
	}

	public static void main(String[] args) {

		// Create circular linked list:
		// 10 -> 20 -> 30 -> 40 -> 50 -> (back to 10)
		ListNode76 head = new ListNode76(10);
		head.next = new ListNode76(20);
		head.next.next = new ListNode76(30);
		head.next.next.next = new ListNode76(40);
		head.next.next.next.next = new ListNode76(50);

		// Make the list circular
		head.next.next.next.next.next = head;

		display(head);

		ListNode76 middle = findMiddle(head);

		System.out.println("Middle node: " + middle.data);
	}
}
