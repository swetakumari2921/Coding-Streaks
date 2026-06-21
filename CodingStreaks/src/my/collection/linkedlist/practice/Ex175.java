package my.collection.linkedlist.practice;

class ListNode43 {
	int val;
	ListNode43 next;

	ListNode43(int val) {
		this.val = val;
	}
}

public class Ex175 {

	public static ListNode43 removeUnique(ListNode43 head) {

		ListNode43 curr = head;

		while (curr != null) {

			int count = 0;
			ListNode43 temp = head;

			// count frequency
			while (temp != null) {
				if (temp.val == curr.val) {
					count++;
				}
				temp = temp.next;
			}

			if (count == 1) {
				// delete curr node
				if (curr == head) {
					head = head.next;
					curr = head;
				} else {
					ListNode43 prev = head;

					while (prev.next != curr) {
						prev = prev.next;
					}

					prev.next = curr.next;
					curr = prev.next;
				}
			} else {
				curr = curr.next;
			}
		}

		return head;
	}

	public static void print(ListNode43 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		ListNode43 head = new ListNode43(1);
		head.next = new ListNode43(2);
		head.next.next = new ListNode43(2);
		head.next.next.next = new ListNode43(3);
		head.next.next.next.next = new ListNode43(4);
		head.next.next.next.next.next = new ListNode43(4);

		head = removeUnique(head);

		print(head);
	}
}
