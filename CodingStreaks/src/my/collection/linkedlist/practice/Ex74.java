package my.collection.linkedlist.practice;

class node24 {
	int data;
	node24 next;

	node24(int d) {
		data = d;
		next = null;
	}
}

class Ex74 {
	public static node24 merge(node24 l1, node24 l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		if (l1.data < l2.data) {
			l1.next = merge(l1.next, l2);
			return l1;
		} else {
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}

	public static void printList(node24 head) {
		node24 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		node24 l1 = new node24(1);
		l1.next = new node24(3);
		l1.next.next = new node24(5);

		node24 l2 = new node24(2);
		l2.next = new node24(4);
		l2.next.next = new node24(6);

		node24 merged = merge(l1, l2);
		System.out.print("Merged LinkedList: ");
		printList(merged);
	}
}
