package my.collection.linkedlist.practice;

class Node69 {
	int data;
	Node69 next;

	Node69(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex129 {

	public static Node69 removeGreater(Node69 head, int x) {

		while (head != null && head.data > x) {
			head = head.next;
		}

		Node69 temp = head;

		while (temp != null && temp.next != null) {

			if (temp.next.data > x) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}

		return head;
	}

	public static void print(Node69 head) {

		Node69 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node69 head = new Node69(10);
		head.next = new Node69(5);
		head.next.next = new Node69(20);
		head.next.next.next = new Node69(3);
		head.next.next.next.next = new Node69(15);

		int x = 10;

		head = removeGreater(head, x);

		print(head);
	}
}
