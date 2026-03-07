package my.collection.linkedlist.practice;

class Node14 {
	int data;
	Node14 next;
	Node14 child;

	Node14(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

public class Ex62 {

	public static Node14 flatten(Node14 head) {
		if (head == null)
			return null;

		Node14 curr = head;

		while (curr != null) {
			if (curr.child != null) {
				Node14 next = curr.next;

				Node14 child = flatten(curr.child);
				curr.next = child;

				Node14 temp = child;
				while (temp.next != null)
					temp = temp.next;

				temp.next = next;
				curr.child = null;
			}
			curr = curr.next;
		}
		return head;
	}

	public static void printList(Node14 head) {
		Node14 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		Node14 head = new Node14(1);
		head.next = new Node14(2);
		head.next.next = new Node14(3);
		head.next.next.next = new Node14(4);

		head.next.child = new Node14(7);
		head.next.child.next = new Node14(8);
		head.next.child.next.child = new Node14(11);
		head.next.child.next.next = new Node14(9);

		System.out.println("Original multilevel list:");
		printList(head);

		head = flatten(head);

		System.out.println("Flattened list:");
		printList(head);
	}
}
