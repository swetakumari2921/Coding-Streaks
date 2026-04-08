package my.collection.linkedlist.practice;

public class Ex96 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		int k = 2;

		Node kthFromStart = head;
		for (int i = 1; i < k && kthFromStart != null; i++)
			kthFromStart = kthFromStart.next;

		Node first = head, second = head;
		for (int i = 0; i < k; i++)
			second = second.next;

		while (second != null) {
			first = first.next;
			second = second.next;
		}

		System.out.println("Kth from start: " + (kthFromStart != null ? kthFromStart.data : -1));
		System.out.println("Kth from end: " + (first != null ? first.data : -1));
	}
}
