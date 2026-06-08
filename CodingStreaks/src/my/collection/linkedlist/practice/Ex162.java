package my.collection.linkedlist.practice;

class ListNode32 {
	int val;
	ListNode32 next;

	ListNode32(int val) {
		this.val = val;
	}
}

public class Ex162 {

	static ListNode32 waveForm(ListNode32 head) {
		ListNode32 curr = head;

		while (curr != null && curr.next != null) {

			if (curr.val > curr.next.val) {
				int temp = curr.val;
				curr.val = curr.next.val;
				curr.next.val = temp;
			}

			if (curr.next.next != null && curr.next.val < curr.next.next.val) {

				int temp = curr.next.val;
				curr.next.val = curr.next.next.val;
				curr.next.next.val = temp;
			}

			curr = curr.next.next;
		}

		return head;
	}

	static void printList(ListNode32 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		ListNode32 head = new ListNode32(10);
		head.next = new ListNode32(5);
		head.next.next = new ListNode32(6);
		head.next.next.next = new ListNode32(3);
		head.next.next.next.next = new ListNode32(2);
		head.next.next.next.next.next = new ListNode32(20);

		head = waveForm(head);

		printList(head);
	}
}
