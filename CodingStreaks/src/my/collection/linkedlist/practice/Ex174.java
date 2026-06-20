package my.collection.linkedlist.practice;

class ListNode42 {
	int val;
	ListNode42 next;

	ListNode42(int val) {
		this.val = val;
	}
}

class Ex174 {

	// count frequency of a value
	static int countFreq(ListNode42 head, int value) {
		int count = 0;
		ListNode42 temp = head;

		while (temp != null) {
			if (temp.val == value) {
				count++;
			}
			temp = temp.next;
		}

		return count;
	}

	// remove all nodes with given value
	static ListNode42 removeAll(ListNode42 head, int value) {

		// remove from head
		while (head != null && head.val == value) {
			head = head.next;
		}

		ListNode42 curr = head;

		while (curr != null && curr.next != null) {
			if (curr.next.val == value) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return head;
	}

	static ListNode42 removeMoreThanTwice(ListNode42 head) {

		ListNode42 curr = head;

		while (curr != null) {

			int val = curr.val;

			// check frequency
			int freq = countFreq(head, val);

			if (freq > 2) {
				head = removeAll(head, val);
			}

			curr = curr.next;
		}

		return head;
	}

	// print list
	static void print(ListNode42 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Example: 1 -> 2 -> 2 -> 2 -> 3 -> 3 -> 4
		ListNode42 head = new ListNode42(1);
		head.next = new ListNode42(2);
		head.next.next = new ListNode42(2);
		head.next.next.next = new ListNode42(2);
		head.next.next.next.next = new ListNode42(3);
		head.next.next.next.next.next = new ListNode42(3);
		head.next.next.next.next.next.next = new ListNode42(4);

		head = removeMoreThanTwice(head);

		print(head); // Output: 1 4
	}
}
