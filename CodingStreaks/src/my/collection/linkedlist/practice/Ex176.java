package my.collection.linkedlist.practice;

class ListNode44 {
	int val;
	ListNode44 next;

	ListNode44(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex176 {

	static int findSecondLargest(ListNode44 head) {

		if (head == null || head.next == null) {
			return -1;
		}

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		ListNode44 curr = head;

		while (curr != null) {

			if (curr.val > max) {
				secondMax = max;
				max = curr.val;
			} else if (curr.val > secondMax && curr.val != max) {
				secondMax = curr.val;
			}

			curr = curr.next;
		}

		return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
	}

	public static void main(String[] args) {

		ListNode44 head = new ListNode44(12);
		head.next = new ListNode44(35);
		head.next.next = new ListNode44(1);
		head.next.next.next = new ListNode44(35);
		head.next.next.next.next = new ListNode44(10);

		System.out.println("Second Largest Element: " + findSecondLargest(head));
	}
}
