package my.collection.linkedlist.practice;

class Node20 {
	int data;
	Node20 next;

	Node20(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex69 {

	public static void deleteNAfterM(Node20 head, int M, int N) {

		Node20 curr = head;

		while (curr != null) {

			for (int i = 1; i < M && curr != null; i++) {
				curr = curr.next;
			}

			if (curr == null)
				return;

			Node20 temp = curr.next;

			for (int i = 0; i < N && temp != null; i++) {
				temp = temp.next;
			}

			curr.next = temp;
			curr = temp;
		}
	}

	public static void printList(Node20 head) {
		Node20 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Node20 head = new Node20(1);
		head.next = new Node20(2);
		head.next.next = new Node20(3);
		head.next.next.next = new Node20(4);
		head.next.next.next.next = new Node20(5);
		head.next.next.next.next.next = new Node20(6);
		head.next.next.next.next.next.next = new Node20(7);
		head.next.next.next.next.next.next.next = new Node20(8);

		int M = 2;
		int N = 2;

		deleteNAfterM(head, M, N);

		printList(head);
	}
}
