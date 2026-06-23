package my.collection.linkedlist.practice;

class ListNode45 {
	int data;
	ListNode45 next;

	ListNode45(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex177 {

	public static int thirdLargest(ListNode45 head) {

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		ListNode45 curr = head;

		while (curr != null) {
			int val = curr.data;

			if (val > first) {
				third = second;
				second = first;
				first = val;
			} else if (val > second && val != first) {
				third = second;
				second = val;
			} else if (val > third && val != second && val != first) {
				third = val;
			}

			curr = curr.next;
		}

		return third;
	}

	public static void main(String[] args) {

		ListNode45 head = new ListNode45(12);
		head.next = new ListNode45(45);
		head.next.next = new ListNode45(7);
		head.next.next.next = new ListNode45(30);
		head.next.next.next.next = new ListNode45(25);

		System.out.println("Third Largest Element: " + thirdLargest(head));
	}
}
