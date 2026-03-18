package my.collection.linkedlist.practice;

class Node23 {
	int data;
	Node23 next;

	Node23(int d) {
		data = d;
		next = null;
	}
}

public class Ex73 {

	static Node23 pairwiseSwap(Node23 head) {
		if (head == null || head.next == null)
			return head;

		Node23 prev = null;
		Node23 curr = head;
		head = curr.next;

		while (curr != null && curr.next != null) {
			Node23 next = curr.next;
			Node23 nextPair = next.next;

			next.next = curr;
			curr.next = nextPair;

			if (prev != null) {
				prev.next = next;
			}

			prev = curr;
			curr = nextPair;
		}

		return head;
	}

	static void printList(Node23 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node23 head = new Node23(1);
		head.next = new Node23(2);
		head.next.next = new Node23(3);
		head.next.next.next = new Node23(4);

		head = pairwiseSwap(head);
		printList(head);
	}
}
