package my.collection.linkedlist.practice;

class ListNode20 {
	int val;
	ListNode20 next;

	ListNode20(int val) {
		this.val = val;
	}
}

public class Ex149 {

	public static ListNode20 skipMdeleteN(ListNode20 head, int M, int N) {

		if (head == null || M < 0 || N < 0)
			return head;

		ListNode20 curr = head;

		while (curr != null) {

			for (int i = 1; i < M && curr != null; i++) {
				curr = curr.next;
			}

			if (curr == null)
				return head;

			ListNode20 temp = curr.next;

			for (int j = 1; j <= N && temp != null; j++) {
				temp = temp.next;
			}

			curr.next = temp;
			curr = temp;
		}

		return head;
	}

	public static void print(ListNode20 head) {

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		ListNode20 head = new ListNode20(1);
		head.next = new ListNode20(2);
		head.next.next = new ListNode20(3);
		head.next.next.next = new ListNode20(4);
		head.next.next.next.next = new ListNode20(5);
		head.next.next.next.next.next = new ListNode20(6);
		head.next.next.next.next.next.next = new ListNode20(7);
		head.next.next.next.next.next.next.next = new ListNode20(8);

		int M = 2, N = 2;

		head = skipMdeleteN(head, M, N);

		print(head);
	}
}
