package my.collection.linkedlist.practice;

class ListNode48 {
	int data;
	ListNode48 next;

	ListNode48(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex183 {

	// Remove nodes where index parity == value parity
	public static ListNode48 removeNodes(ListNode48 head) {
		ListNode48 dummy = new ListNode48(0);
		dummy.next = head;

		ListNode48 prev = dummy;
		ListNode48 curr = head;

		int index = 0;

		while (curr != null) {
			if ((index % 2) == (curr.data % 2)) {
				prev.next = curr.next; // Remove node
			} else {
				prev = curr;
			}
			curr = curr.next;
			index++;
		}

		return dummy.next;
	}

	public static void display(ListNode48 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode48 head = new ListNode48(10);
		head.next = new ListNode48(15);
		head.next.next = new ListNode48(8);
		head.next.next.next = new ListNode48(21);
		head.next.next.next.next = new ListNode48(14);
		head.next.next.next.next.next = new ListNode48(7);

		System.out.print("Original List: ");
		display(head);

		head = removeNodes(head);

		System.out.print("After Removal: ");
		display(head);
	}
}
