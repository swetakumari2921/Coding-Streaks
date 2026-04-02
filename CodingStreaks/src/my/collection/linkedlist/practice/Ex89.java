package my.collection.linkedlist.practice;

class node38 {
	int data;
	node38 next;

	node38(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex89 {
	static node38 head;

	public static void removeNthFromEnd(int n) {
		node38 dummy = new node38(0);
		dummy.next = head;
		node38 first = dummy;
		node38 second = dummy;

		for (int i = 0; i <= n; i++) {
			if (first != null)
				first = first.next;
		}

		while (first != null) {
			first = first.next;
			second = second.next;
		}

		if (second.next != null) {
			second.next = second.next.next;
		}

		head = dummy.next;
	}

	public static void printList() {
		node38 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		head = new node38(1);
		head.next = new node38(2);
		head.next.next = new node38(3);
		head.next.next.next = new node38(4);
		head.next.next.next.next = new node38(5);

		System.out.println("Original List:");
		printList();

		removeNthFromEnd(2);

		System.out.println("After Removing 2nd Node from End:");
		printList();
	}
}
