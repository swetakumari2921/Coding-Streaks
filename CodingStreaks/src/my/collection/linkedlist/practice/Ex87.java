package my.collection.linkedlist.practice;

class Node36 {
	int data;
	Node36 next;

	Node36(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex87 {

	static Node36 reverseLastK(Node36 head, int k) {
		if (head == null || k <= 0)
			return head;

		Node36 temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}

		if (k >= length)
			return reverseList(head);

		int stop = length - k - 1;
		Node36 current = head;
		for (int i = 0; i < stop; i++) {
			current = current.next;
		}

		Node36 newHead = reverseList(current.next);
		current.next = newHead;
		return head;
	}

	static Node36 reverseList(Node36 head) {
		Node36 prev = null;
		Node36 curr = head;
		Node36 next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static void printList(Node36 head) {
		Node36 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node36 head = new Node36(1);
		head.next = new Node36(2);
		head.next.next = new Node36(3);
		head.next.next.next = new Node36(4);
		head.next.next.next.next = new Node36(5);

		int k = 3;
		head = reverseLastK(head, k);

		printList(head);
	}
}