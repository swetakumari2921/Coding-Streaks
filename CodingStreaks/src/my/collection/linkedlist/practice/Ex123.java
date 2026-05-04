package my.collection.linkedlist.practice;

class Node67 {
	int data;
	Node67 next;

	Node67(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex123 {

	static Node67 reversePairs(Node67 head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node67 first = head;
		Node67 second = head.next;

		first.next = reversePairs(second.next);
		second.next = first;

		return second;
	}

	static void print(Node67 head) {
		Node67 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node67 head = new Node67(1);
		head.next = new Node67(2);
		head.next.next = new Node67(3);
		head.next.next.next = new Node67(4);
		head.next.next.next.next = new Node67(5);

		head = reversePairs(head);
		print(head);
	}
}
