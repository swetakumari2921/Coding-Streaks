package my.collection.linkedlist.practice;

public class Ex98 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static Node head;

	static void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	static void split() {
		if (head == null || head.next == null) {
			System.out.println("First Half:");
			print(head);
			System.out.println("Second Half:");
			print(null);
			return;
		}

		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node second = slow.next;
		slow.next = null;

		System.out.println("First Half:");
		print(head);

		System.out.println("Second Half:");
		print(second);
	}

	static void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);

		split();
	}
}
