package my.collection.linkedlist.practice;

public class Ex101 {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static Node reverseBetween(Node head, int m, int n) {
		if (head == null)
			return null;

		Node dummy = new Node(0);
		dummy.next = head;

		Node prev = dummy;

		for (int i = 1; i < m; i++) {
			prev = prev.next;
		}

		Node curr = prev.next;

		for (int i = 0; i < n - m; i++) {
			Node temp = curr.next;
			curr.next = temp.next;
			temp.next = prev.next;
			prev.next = temp;
		}

		return dummy.next;
	}

	static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		head = reverseBetween(head, 2, 4);

		print(head);
	}
}
