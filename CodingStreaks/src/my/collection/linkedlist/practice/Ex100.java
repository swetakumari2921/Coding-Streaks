package my.collection.linkedlist.practice;

public class Ex100 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);

		int k = 2;

		Node slow = head;
		Node fast = head;

		for (int i = 0; i < k && fast != null; i++) {
			slow = slow.next;
			fast = fast.next;
		}

		for (int i = 0; i < 2 * k && fast != null; i++) {
			fast = fast.next;
		}

		System.out.println(slow != null ? slow.data : -1);
		System.out.println(fast != null ? fast.data : -1);
	}
}
