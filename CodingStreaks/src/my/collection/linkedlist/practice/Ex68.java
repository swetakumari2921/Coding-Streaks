package my.collection.linkedlist.practice;

class Node19 {
	int data;
	Node19 next;
	Node19 random;

	Node19(int data) {
		this.data = data;
		this.next = null;
		this.random = null;
	}
}

public class Ex68 {

	public static Node19 cloneList(Node19 head) {
		if (head == null)
			return null;

		Node19 curr = head;
		while (curr != null) {
			Node19 copy = new Node19(curr.data);
			copy.next = curr.next;
			curr.next = copy;
			curr = copy.next;
		}

		curr = head;
		while (curr != null) {
			if (curr.random != null)
				curr.next.random = curr.random.next;
			curr = curr.next.next;
		}

		Node19 dummy = new Node19(0);
		Node19 copyCurr = dummy;
		curr = head;

		while (curr != null) {
			copyCurr.next = curr.next;
			curr.next = curr.next.next;
			copyCurr = copyCurr.next;
			curr = curr.next;
		}

		return dummy.next;
	}

	public static void printList(Node19 head) {
		Node19 curr = head;
		while (curr != null) {
			int randomData = (curr.random != null) ? curr.random.data : -1;
			System.out.println("Node: " + curr.data + ", Random: " + randomData);
			curr = curr.next;
		}
	}

	public static void main(String[] args) {

		Node19 head = new Node19(1);
		head.next = new Node19(2);
		head.next.next = new Node19(3);
		head.next.next.next = new Node19(4);

		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next;
		head.next.next.next.random = head.next;

		System.out.println("Original list:");
		printList(head);

		Node19 cloned = cloneList(head);

		System.out.println("\nCloned list:");
		printList(cloned);
	}
}
