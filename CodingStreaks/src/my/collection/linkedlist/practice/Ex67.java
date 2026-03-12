package my.collection.linkedlist.practice;

class Node18 {
	int data;
	Node18 next;

	Node18(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex67 {

	public static Node18 reverse(Node18 head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node18 rest = reverse(head.next);
		head.next.next = head;
		head.next = null;

		return rest;
	}

	public static void printList(Node18 head) {
		Node18 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node18 head = new Node18(1);
		head.next = new Node18(2);
		head.next.next = new Node18(3);
		head.next.next.next = new Node18(4);

		System.out.println("Original LinkedList:");
		printList(head);

		head = reverse(head);

		System.out.println("Reversed LinkedList:");
		printList(head);
	}
}