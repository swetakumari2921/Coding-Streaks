package my.collection.linkedlist.practice;

class ListNode7 {
	int val;
	ListNode7 next;

	ListNode7(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Ex133 {

	public static int countOccurrences(ListNode7 head, int key) {

		int count = 0;
		ListNode7 temp = head;

		while (temp != null) {

			if (temp.val == key) {
				count++;
			}

			temp = temp.next;
		}

		return count;
	}

	public static void main(String[] args) {

		// LinkedList: 5 -> 2 -> 7 -> 2 -> 9 -> 2
		ListNode7 head = new ListNode7(5);
		head.next = new ListNode7(2);
		head.next.next = new ListNode7(7);
		head.next.next.next = new ListNode7(2);
		head.next.next.next.next = new ListNode7(9);
		head.next.next.next.next.next = new ListNode7(2);

		int key = 2;

		int result = countOccurrences(head, key);

		System.out.println("Occurrences of " + key + " = " + result);
	}
}
