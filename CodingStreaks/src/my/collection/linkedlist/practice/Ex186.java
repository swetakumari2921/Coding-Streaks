package my.collection.linkedlist.practice;

class ListNode51 {
	int data;
	ListNode51 next;

	ListNode51(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex186 {

	static ListNode51 zigZag(ListNode51 head) {

		if (head == null || head.next == null) {
			return head;
		}

		boolean flag = true;
		ListNode51 curr = head;

		while (curr.next != null) {

			if (flag) {
				if (curr.data > curr.next.data) {
					int temp = curr.data;
					curr.data = curr.next.data;
					curr.next.data = temp;
				}
			} else {
				if (curr.data < curr.next.data) {
					int temp = curr.data;
					curr.data = curr.next.data;
					curr.next.data = temp;
				}
			}

			flag = !flag;
			curr = curr.next;
		}

		return head;
	}

	static void display(ListNode51 head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode51 head = new ListNode51(4);
		head.next = new ListNode51(3);
		head.next.next = new ListNode51(7);
		head.next.next.next = new ListNode51(8);
		head.next.next.next.next = new ListNode51(6);
		head.next.next.next.next.next = new ListNode51(2);
		head.next.next.next.next.next.next = new ListNode51(1);

		System.out.println("Original LinkedList:");
		display(head);

		head = zigZag(head);

		System.out.println("Zig-Zag LinkedList:");
		display(head);
	}
}
