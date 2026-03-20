package my.collection.linkedlist.practice;

class node25 {
	int data;
	node25 next;

	node25(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex75 {
	public static void main(String[] args) {
		node25 head = new node25(10);
		head.next = new node25(20);
		head.next.next = new node25(30);
		head.next.next.next = new node25(40);
		head.next.next.next.next = new node25(50);

		int n = 2;

		node25 result = findNthFromEnd(head, n);
		if (result != null)
			System.out.println(result.data);
	}

	public static node25 findNthFromEnd(node25 head, int n) {
		node25 fast = head;
		node25 slow = head;

		for (int i = 0; i < n; i++) {
			if (fast == null)
				return null;
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow;
	}
}
