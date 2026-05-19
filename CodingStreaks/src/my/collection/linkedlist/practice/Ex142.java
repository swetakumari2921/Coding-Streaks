package my.collection.linkedlist.practice;

class ListNode14 {
	int data;
	ListNode14 next;

	ListNode14(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex142 {

	// Insert at end
	public static ListNode14 insert(ListNode14 head, int data) {
		ListNode14 newNode = new ListNode14(data);

		if (head == null)
			return newNode;

		ListNode14 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;

		return head;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 3, 4, 3, 2, 1 };

		ListNode14 head = null;

		// build linked list
		for (int i = 0; i < arr.length; i++) {
			head = insert(head, arr[i]);
		}

		// find first repeating element
		ListNode14 outer = head;

		while (outer != null) {

			ListNode14 inner = outer.next;

			while (inner != null) {
				if (outer.data == inner.data) {
					System.out.println("First repeating element: " + outer.data);
					return;
				}
				inner = inner.next;
			}

			outer = outer.next;
		}

		System.out.println("No repeating element found");
	}
}
