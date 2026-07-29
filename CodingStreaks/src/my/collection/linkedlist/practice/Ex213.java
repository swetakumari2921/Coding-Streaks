package my.collection.linkedlist.practice;

public class Ex213 {

	static class ListNode78 {
		int data;
		ListNode78 next;

		ListNode78(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static ListNode78[] splitCircularList(ListNode78 head) {

		if (head == null || head.next == head) {
			return new ListNode78[] { head, null };
		}

		ListNode78 slow = head;
		ListNode78 fast = head;

		// Find middle node
		while (fast.next != head && fast.next.next != head) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// For even nodes
		if (fast.next.next == head) {
			fast = fast.next;
		}

		ListNode78 head1 = head;
		ListNode78 head2 = slow.next;

		// Close first circular half
		slow.next = head1;

		// Close second circular half
		fast.next = head2;

		return new ListNode78[] { head1, head2 };
	}

	public static void printCircular(ListNode78 head) {

		if (head == null) {
			return;
		}

		ListNode78 temp = head;

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);

		System.out.println();
	}

	public static void main(String[] args) {

		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> back to 1

		ListNode78 head = new ListNode78(1);
		head.next = new ListNode78(2);
		head.next.next = new ListNode78(3);
		head.next.next.next = new ListNode78(4);
		head.next.next.next.next = new ListNode78(5);
		head.next.next.next.next.next = new ListNode78(6);

		// Making circular
		head.next.next.next.next.next.next = head;

		ListNode78[] result = splitCircularList(head);

		System.out.print("First Half: ");
		printCircular(result[0]);

		System.out.print("Second Half: ");
		printCircular(result[1]);
	}
}
