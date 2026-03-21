package my.collection.linkedlist.practice;

class Node26 {
	int data;
	Node26 next;

	Node26(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex76 {

	public static Node26 segregate(Node26 head) {
		if (head == null)
			return null;

		Node26 evenHead = null, evenTail = null;
		Node26 oddHead = null, oddTail = null;

		Node26 current = head;
		while (current != null) {
			if (current.data % 2 == 0) {
				if (evenHead == null) {
					evenHead = evenTail = current;
				} else {
					evenTail.next = current;
					evenTail = evenTail.next;
				}
			} else {
				if (oddHead == null) {
					oddHead = oddTail = current;
				} else {
					oddTail.next = current;
					oddTail = oddTail.next;
				}
			}
			current = current.next;
		}

		if (evenTail != null) {
			evenTail.next = oddHead;
		}
		if (oddTail != null) {
			oddTail.next = null;
		}

		return (evenHead != null) ? evenHead : oddHead;
	}

	public static void printList(Node26 head) {
		Node26 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node26 head = new Node26(1);
		head.next = new Node26(2);
		head.next.next = new Node26(3);
		head.next.next.next = new Node26(4);
		head.next.next.next.next = new Node26(5);

		System.out.println("Original List:");
		printList(head);

		head = segregate(head);

		System.out.println("Even-Odd Segregated List:");
		printList(head);
	}
}
