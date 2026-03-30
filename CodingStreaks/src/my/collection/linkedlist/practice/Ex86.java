package my.collection.linkedlist.practice;

class Node35 {
	int data;
	Node35 next;

	Node35(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex86 {

	static Node35 reverseFirstK(Node35 head, int k) {
		if (head == null || k <= 1)
			return head;

		Node35 current = head;
		Node35 prev = null;
		Node35 next = null;
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

		return prev;
	}

	static void printList(Node35 head) {
		Node35 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node35 head = new Node35(1);
		head.next = new Node35(2);
		head.next.next = new Node35(3);
		head.next.next.next = new Node35(4);
		head.next.next.next.next = new Node35(5);

		int k = 3;
		head = reverseFirstK(head, k);

		printList(head);
	}
}
