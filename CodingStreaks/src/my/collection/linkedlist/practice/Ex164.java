package my.collection.linkedlist.practice;

class ListNode34 {
	int data;
	ListNode34 prev;
	ListNode34 next;

	ListNode34(int data) {
		this.data = data;
	}
}

public class Ex164 {

	static ListNode34 convertToSingly(ListNode34 head) {
		ListNode34 curr = head;

		while (curr != null) {
			curr.prev = null; // remove backward link
			curr = curr.next;
		}

		return head;
	}

	static void print(ListNode34 head) {
		ListNode34 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {

		ListNode34 head = new ListNode34(5);
		ListNode34 n1 = new ListNode34(10);
		ListNode34 n2 = new ListNode34(15);

		head.next = n1;
		n1.prev = head;

		n1.next = n2;
		n2.prev = n1;

		convertToSingly(head);

		print(head);
	}
}
