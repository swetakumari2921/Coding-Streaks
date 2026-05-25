package my.collection.linkedlist.practice;

class ListNode19 {
	int val;
	ListNode19 next;

	ListNode19(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex148 {

	static ListNode19 deleteKthNode(ListNode19 head, int k) {

		if (head == null || k <= 0)
			return head;

		if (k == 1)
			return null; // all nodes removed

		ListNode19 curr = head;
		ListNode19 prev = null;
		int count = 1;

		while (curr != null) {

			if (count % k == 0) {
				// delete current node
				prev.next = curr.next;
			} else {
				prev = curr;
			}

			curr = curr.next;
			count++;
		}

		return head;
	}

	static void print(ListNode19 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
		ListNode19 head = new ListNode19(1);
		head.next = new ListNode19(2);
		head.next.next = new ListNode19(3);
		head.next.next.next = new ListNode19(4);
		head.next.next.next.next = new ListNode19(5);
		head.next.next.next.next.next = new ListNode19(6);
		head.next.next.next.next.next.next = new ListNode19(7);

		int k = 3;

		head = deleteKthNode(head, k);

		System.out.println("After deleting every " + k + "-th node:");
		print(head);
	}
}
