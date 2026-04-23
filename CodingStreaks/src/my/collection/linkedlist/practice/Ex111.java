package my.collection.linkedlist.practice;

class Node55 {
	int data;
	Node55 next;

	Node55(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex111 {

	static Node55 removeAllDuplicates(Node55 head) {
		Node55 dummy = new Node55(0);
		dummy.next = head;

		Node55 prev = dummy;

		while (head != null) {

			boolean duplicate = false;

			while (head.next != null && head.data == head.next.data) {
				duplicate = true;
				head = head.next;
			}

			if (duplicate) {
				prev.next = head.next;
			} else {
				prev = prev.next;
			}

			head = head.next;
		}

		return dummy.next;
	}

	static void print(Node55 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node55 head = new Node55(1);
		head.next = new Node55(2);
		head.next.next = new Node55(2);
		head.next.next.next = new Node55(3);
		head.next.next.next.next = new Node55(4);
		head.next.next.next.next.next = new Node55(4);
		head.next.next.next.next.next.next = new Node55(5);

		head = removeAllDuplicates(head);

		print(head);
	}
}
