package my.collection.linkedlist.practice;

class ListNode38 {
	int val;
	ListNode38 next;

	ListNode38(int val) {
		this.val = val;
	}
}

public class Ex170 {

	// check perfect square
	public static boolean isPerfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return s * s == x;
	}

	// check Fibonacci number
	public static boolean isFibonacci(int n) {
		return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
	}

	public static ListNode38 keepFibo(ListNode38 head) {

		// remove invalid head nodes
		while (head != null && !isFibonacci(head.val)) {
			head = head.next;
		}

		ListNode38 curr = head;

		while (curr != null && curr.next != null) {

			if (!isFibonacci(curr.next.val)) {
				curr.next = curr.next.next; // delete node
			} else {
				curr = curr.next;
			}
		}

		return head;
	}

	public static void print(ListNode38 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode38 head = new ListNode38(10);
		head.next = new ListNode38(1);
		head.next.next = new ListNode38(2);
		head.next.next.next = new ListNode38(3);
		head.next.next.next.next = new ListNode38(4);
		head.next.next.next.next.next = new ListNode38(5);
		head.next.next.next.next.next.next = new ListNode38(6);
		head.next.next.next.next.next.next.next = new ListNode38(8);
		head.next.next.next.next.next.next.next.next = new ListNode38(13);

		head = keepFibo(head);

		System.out.println("Fibonacci Nodes:");
		print(head);
	}
}
