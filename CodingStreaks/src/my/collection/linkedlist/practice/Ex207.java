package my.collection.linkedlist.practice;

class ListNode73 {
	int data;
	ListNode73 next;

	ListNode73(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex207 {

	// Convert Singly LinkedList to Circular LinkedList
	public static ListNode73 convertToCircular(ListNode73 head) {
		if (head == null) {
			return null;
		}

		ListNode73 temp = head;

		// Traverse to the last node
		while (temp.next != null) {
			temp = temp.next;
		}

		// Make last node point to head
		temp.next = head;

		return head;
	}

	// Display first 'count' nodes of Circular LinkedList
	public static void display(ListNode73 head, int count) {
		if (head == null) {
			return;
		}

		ListNode73 temp = head;

		for (int i = 0; i < count; i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode73 head = new ListNode73(10);
		head.next = new ListNode73(20);
		head.next.next = new ListNode73(30);
		head.next.next.next = new ListNode73(40);

		head = convertToCircular(head);

		System.out.println("Circular LinkedList (first 8 nodes):");
		display(head, 8);
	}
}
