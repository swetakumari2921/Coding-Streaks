package my.collection.linkedlist.practice;

class ListNode4 {
	int data;
	ListNode4 next;

	ListNode4(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex127 {

	public static boolean areIdentical(ListNode4 head1, ListNode4 head2) {

		while (head1 != null && head2 != null) {

			if (head1.data != head2.data) {
				return false;
			}

			head1 = head1.next;
			head2 = head2.next;
		}

		// If both are null → same length
		return (head1 == null && head2 == null);
	}

	// Helper to add node at end
	public static ListNode4 insert(ListNode4 head, int data) {
		ListNode4 newNode = new ListNode4(data);

		if (head == null)
			return newNode;

		ListNode4 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		return head;
	}

	public static void main(String[] args) {

		ListNode4 head1 = null;
		head1 = insert(head1, 1);
		head1 = insert(head1, 2);
		head1 = insert(head1, 3);

		ListNode4 head2 = null;
		head2 = insert(head2, 1);
		head2 = insert(head2, 2);
		head2 = insert(head2, 3);

		System.out.println(areIdentical(head1, head2)); // true
	}
}
