package my.collection.linkedlist.practice;

class DigitNode {
	int data;
	DigitNode next;

	DigitNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex109 {

	static DigitNode reverse(DigitNode head) {
		DigitNode prev = null;
		DigitNode curr = head;

		while (curr != null) {
			DigitNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static DigitNode subtract(DigitNode l1, DigitNode l2) {
		l1 = reverse(l1);
		l2 = reverse(l2);

		DigitNode dummy = new DigitNode(0);
		DigitNode curr = dummy;

		int borrow = 0;

		while (l1 != null) {
			int d1 = l1.data - borrow;
			int d2 = (l2 != null) ? l2.data : 0;

			if (d1 < d2) {
				d1 += 10;
				borrow = 1;
			} else {
				borrow = 0;
			}

			curr.next = new DigitNode(d1 - d2);
			curr = curr.next;

			l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		DigitNode result = reverse(dummy.next);

		while (result != null && result.data == 0 && result.next != null) {
			result = result.next;
		}

		return result;
	}

	static void print(DigitNode head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		DigitNode l1 = new DigitNode(1);
		l1.next = new DigitNode(0);
		l1.next.next = new DigitNode(0);

		DigitNode l2 = new DigitNode(9);
		l2.next = new DigitNode(9);

		DigitNode res = subtract(l1, l2);
		print(res);
	}
}
