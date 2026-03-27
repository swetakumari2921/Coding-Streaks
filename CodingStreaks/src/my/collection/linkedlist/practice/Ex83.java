package my.collection.linkedlist.practice;

class Node33 {
	int data;
	Node33 next;

	Node33(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex83 {
	public static void main(String[] args) {
		Node33 head = new Node33(10);
		head.next = new Node33(20);
		head.next.next = new Node33(30);
		head.next.next.next = new Node33(40);

		int count = 0;
		Node33 temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		System.out.println("Number of nodes: " + count);
	}
}
