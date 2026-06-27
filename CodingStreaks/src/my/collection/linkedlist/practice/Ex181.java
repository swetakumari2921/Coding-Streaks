package my.collection.linkedlist.practice;

class ListNode46 {
	int data;
	ListNode46 next;

	ListNode46(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex181 {

	// Check if value already exists
	static boolean contains(ListNode46 head, int value) {
		while (head != null) {
			if (head.data == value)
				return true;
			head = head.next;
		}
		return false;
	}

	// Add node at end
	static ListNode46 addLast(ListNode46 head, int value) {
		ListNode46 newNode = new ListNode46(value);

		if (head == null)
			return newNode;

		ListNode46 temp = head;
		while (temp.next != null)
			temp = temp.next;

		temp.next = newNode;
		return head;
	}

	// Find Union
	static ListNode46 union(ListNode46 head1, ListNode46 head2) {
		ListNode46 result = null;

		ListNode46 temp = head1;
		while (temp != null) {
			if (!contains(result, temp.data))
				result = addLast(result, temp.data);
			temp = temp.next;
		}

		temp = head2;
		while (temp != null) {
			if (!contains(result, temp.data))
				result = addLast(result, temp.data);
			temp = temp.next;
		}

		return result;
	}

	// Print List
	static void printList(ListNode46 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		// First List: 1 -> 2 -> 3 -> 4
		ListNode46 head1 = new ListNode46(1);
		head1.next = new ListNode46(2);
		head1.next.next = new ListNode46(3);
		head1.next.next.next = new ListNode46(4);

		// Second List: 3 -> 4 -> 5 -> 6
		ListNode46 head2 = new ListNode46(3);
		head2.next = new ListNode46(4);
		head2.next.next = new ListNode46(5);
		head2.next.next.next = new ListNode46(6);

		ListNode46 result = union(head1, head2);

		System.out.print("Union: ");
		printList(result);
	}
}
