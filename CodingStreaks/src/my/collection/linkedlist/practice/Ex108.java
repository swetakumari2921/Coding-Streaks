package my.collection.linkedlist.practice;

class Node53 {
	int data;
	Node53 next;

	Node53(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex108 {

	static Node53 reverse(Node53 head) {
		Node53 prev = null;
		Node53 curr = head;

		while (curr != null) {
			Node53 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static Node53 subtract(Node53 l1, Node53 l2) {
		l1 = reverse(l1);
		l2 = reverse(l2);

		Node53 dummy = new Node53(0);
		Node53 temp = dummy;

		int borrow = 0;

		while (l1 != null) {
			int x = l1.data - borrow;
			int y = (l2 != null) ? l2.data : 0;

			if (x < y) {
				x = x + 10;
				borrow = 1;
			} else {
				borrow = 0;
			}

			temp.next = new Node53(x - y);
			temp = temp.next;

			l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		return reverse(dummy.next);
	}

	static void print(Node53 head) {
		while (head != null) {
			System.out.print(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node53 l1 = new Node53(5);
		l1.next = new Node53(6);
		l1.next.next = new Node53(2);

		Node53 l2 = new Node53(3);
		l2.next = new Node53(4);
		l2.next.next = new Node53(1);

		Node53 result = subtract(l1, l2);
		print(result);
	}
}
