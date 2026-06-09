package my.collection.linkedlist.practice;

class ListNode33 {
	int data;
	ListNode33 next;

	ListNode33(int data) {
		this.data = data;
	}
}

class DoublyNode {
	int data;
	DoublyNode prev, next;

	DoublyNode(int data) {
		this.data = data;
	}
}

public class Ex163 {

	public static DoublyNode convertToDoubly(ListNode33 head) {
		if (head == null) {
			return null;
		}

		DoublyNode dHead = new DoublyNode(head.data);
		DoublyNode currD = dHead;
		head = head.next;

		while (head != null) {
			DoublyNode newNode = new DoublyNode(head.data);
			currD.next = newNode;
			newNode.prev = currD;
			currD = newNode;
			head = head.next;
		}

		return dHead;
	}

	public static void printDoubly(DoublyNode head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		ListNode33 head = new ListNode33(10);
		head.next = new ListNode33(20);
		head.next.next = new ListNode33(30);
		head.next.next.next = new ListNode33(40);

		DoublyNode dHead = convertToDoubly(head);

		printDoubly(dHead);
	}
}
