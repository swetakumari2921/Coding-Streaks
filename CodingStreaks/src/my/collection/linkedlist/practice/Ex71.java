package my.collection.linkedlist.practice;

class Node22 {
	int data;
	Node22 next;

	Node22(int d) {
		data = d;
		next = null;
	}
}

public class Ex71 {

	static Node22 reverseAlternateK(Node22 head, int k) {

		Node22 current = head;
		Node22 prev = null;
		Node22 next = null;
		int count = 0;

		while (current != null && count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (head != null)
			head.next = current;

		count = 0;
		while (count < k - 1 && current != null) {
			current = current.next;
			count++;
		}

		if (current != null)
			current.next = reverseAlternateK(current.next, k);

		return prev;
	}

	static void printList(Node22 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node22 head = new Node22(1);
		head.next = new Node22(2);
		head.next.next = new Node22(3);
		head.next.next.next = new Node22(4);
		head.next.next.next.next = new Node22(5);
		head.next.next.next.next.next = new Node22(6);
		head.next.next.next.next.next.next = new Node22(7);
		head.next.next.next.next.next.next.next = new Node22(8);

		int k = 2;

		head = reverseAlternateK(head, k);

		printList(head);
	}
}