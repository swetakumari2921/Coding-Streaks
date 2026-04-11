package my.collection.linkedlist.practice;

public class Ex99 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node findCycleStart(Node head) {
		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				Node temp = head;
				while (temp != slow) {
					temp = temp.next;
					slow = slow.next;
				}
				return temp;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);

		head.next.next.next.next.next.next = head.next.next; // cycle at node 3

		Node start = findCycleStart(head);

		if (start != null) {
			System.out.println(start.data);
		} else {
			System.out.println("No cycle");
		}
	}
}
