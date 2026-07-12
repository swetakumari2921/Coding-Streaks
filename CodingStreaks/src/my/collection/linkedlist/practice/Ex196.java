package my.collection.linkedlist.practice;

class ListNode60 {
	int data;
	ListNode60 next;
	ListNode60 child;

	ListNode60(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

public class Ex196 {

	static ListNode60 flattenDFS(ListNode60 head) {
		flatten(head);
		return head;
	}

	static ListNode60 flatten(ListNode60 node) {
		ListNode60 current = node;
		ListNode60 last = null;

		while (current != null) {
			ListNode60 nextNode = current.next;

			if (current.child != null) {
				ListNode60 childHead = current.child;
				ListNode60 childTail = flatten(childHead);

				current.next = childHead;
				current.child = null;

				childTail.next = nextNode;
				last = childTail;
			} else {
				last = current;
			}

			current = nextNode;
		}

		return last;
	}

	static void display(ListNode60 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode60 head = new ListNode60(1);
		head.next = new ListNode60(2);
		head.next.next = new ListNode60(3);
		head.next.next.next = new ListNode60(4);

		head.next.child = new ListNode60(5);
		head.next.child.next = new ListNode60(6);

		head.next.child.child = new ListNode60(7);
		head.next.child.child.next = new ListNode60(8);

		head.next.next.child = new ListNode60(9);

		System.out.println("Flattened Linked List:");
		flattenDFS(head);
		display(head);
	}
}
