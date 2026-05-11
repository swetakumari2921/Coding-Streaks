package my.collection.linkedlist.practice;

class ListNode8 {
	int val;
	ListNode7 next;

	ListNode8(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex134 {

	public static void replaceAll(ListNode7 head, int oldValue, int newValue) {

		ListNode7 temp = head;

		while (temp != null) {

			if (temp.val == oldValue) {
				temp.val = newValue;
			}

			temp = temp.next;
		}
	}

	public static void print(ListNode7 head) {

		ListNode7 temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		// LinkedList: 1 -> 2 -> 3 -> 2 -> 4 -> 2
		ListNode7 head = new ListNode7(1);
		head.next = new ListNode7(2);
		head.next.next = new ListNode7(3);
		head.next.next.next = new ListNode7(2);
		head.next.next.next.next = new ListNode7(4);
		head.next.next.next.next.next = new ListNode7(2);

		System.out.print("Before: ");
		print(head);

		replaceAll(head, 2, 99);

		System.out.print("After: ");
		print(head);
	}
}
