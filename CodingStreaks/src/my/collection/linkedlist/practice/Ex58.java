package my.collection.linkedlist.practice;

class Node10 {
	int data;
	Node10 next;

	Node10(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex58 {

	static Node10 head;

	public static void main(String[] args) {

		head = new Node10(1);
		head.next = new Node10(2);
		head.next.next = new Node10(3);
		head.next.next.next = new Node10(4);
		head.next.next.next.next = head.next; // loop

		if (detectLoop()) {
			System.out.println("Loop detected");
			removeLoop();
			System.out.println("Loop removed");
		} else {
			System.out.println("No loop");
		}
	}

	static boolean detectLoop() {
		Node10 slow = head;
		Node10 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	static void removeLoop() {
		Node10 slow = head;
		Node10 fast = head;

		while (true) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		slow = head;

		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}

		fast.next = null;
	}
}
