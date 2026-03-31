package my.collection.linkedlist.practice;

class Node37 {
	int data;
	Node37 next;

	Node37(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex88 {

	static Node37 deleteAll(Node37 head, int key) {
		while (head != null && head.data == key) {
			head = head.next;
		}

		Node37 current = head;

		while (current != null && current.next != null) {
			if (current.next.data == key)
				current.next = current.next.next;
			else
				current = current.next;
		}

		return head;
	}

	static void printList(Node37 head) {
		Node37 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node37 head = new Node37(2);
		head.next = new Node37(3);
		head.next.next = new Node37(2);
		head.next.next.next = new Node37(4);
		head.next.next.next.next = new Node37(2);

		int key = 2;
		head = deleteAll(head, key);

		printList(head);
	}
}
