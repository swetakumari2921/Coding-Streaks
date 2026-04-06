package my.collection.linkedlist.practice;

class node41 {
	int data;
	node41 next;

	node41(int data) {
		this.data = data;
		this.next = null;
	}
}

class Ex93 {
	node41 head;

	void deleteMiddle() {
		if (head == null || head.next == null) {
			head = null;
			return;
		}

		node41 slow = head;
		node41 fast = head;
		node41 prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}

		prev.next = slow.next;
	}

	void printList() {
		node41 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Ex93 list = new Ex93();
		list.head = new node41(1);
		list.head.next = new node41(2);
		list.head.next.next = new node41(3);
		list.head.next.next.next = new node41(4);
		list.head.next.next.next.next = new node41(5);

		System.out.println("Original list:");
		list.printList();

		list.deleteMiddle();

		System.out.println("After deleting middle node:");
		list.printList();
	}
}
