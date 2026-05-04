package my.collection.linkedlist.practice;

class Node66 {
	int data;
	Node66 next;

	Node66(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex122 {

	static Node66 partition(Node66 head, int x) {
		Node66 lessHead = new Node66(0);
		Node66 greaterHead = new Node66(0);

		Node66 less = lessHead;
		Node66 greater = greaterHead;

		Node66 curr = head;

		while (curr != null) {
			if (curr.data < x) {
				less.next = curr;
				less = less.next;
			} else {
				greater.next = curr;
				greater = greater.next;
			}
			curr = curr.next;
		}

		greater.next = null;
		less.next = greaterHead.next;

		return lessHead.next;
	}

	static void print(Node66 head) {
		Node66 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node66 head = new Node66(3);
		head.next = new Node66(5);
		head.next.next = new Node66(8);
		head.next.next.next = new Node66(5);
		head.next.next.next.next = new Node66(10);
		head.next.next.next.next.next = new Node66(2);
		head.next.next.next.next.next.next = new Node66(1);

		int x = 5;

		head = partition(head, x);
		print(head);
	}
}
