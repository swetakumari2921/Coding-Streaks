package my.collection.linkedlist.practice;

class Node40 {
	int data;
	Node40 next;

	Node40(int d) {
		data = d;
		next = null;
	}
}

class Ex91 {
	static Node40 moveLastToFront(Node40 head) {
		if (head == null || head.next == null)
			return head;
		Node40 secondLast = head;
		while (secondLast.next.next != null) {
			secondLast = secondLast.next;
		}
		Node40 last = secondLast.next;
		secondLast.next = null;
		last.next = head;
		head = last;
		return head;
	}

	static void printList(Node40 head) {
		Node40 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node40 head = new Node40(10);
		head.next = new Node40(20);
		head.next.next = new Node40(30);
		head.next.next.next = new Node40(40);

		head = moveLastToFront(head);
		printList(head);
	}
}
