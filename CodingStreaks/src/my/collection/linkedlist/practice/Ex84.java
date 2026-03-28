package my.collection.linkedlist.practice;

class node34 {
	int data;
	node34 next;

	node34(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex84 {

	static void printReverse(node34 head) {
		if (head == null)
			return;

		printReverse(head.next);
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		node34 head = new node34(1);
		head.next = new node34(2);
		head.next.next = new node34(3);
		head.next.next.next = new node34(4);

		printReverse(head);
	}
}
