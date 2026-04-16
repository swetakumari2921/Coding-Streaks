package my.collection.linkedlist.practice;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex104 {

	static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static ListNode deleteGreaterOnRight(ListNode head) {
		head = reverse(head);

		ListNode curr = head;
		ListNode maxNode = head;

		while (curr != null && curr.next != null) {
			if (curr.next.data < maxNode.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
				maxNode = curr;
			}
		}

		return reverse(head);
	}

	static void print(ListNode head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(12);
		head.next = new ListNode(15);
		head.next.next = new ListNode(10);
		head.next.next.next = new ListNode(11);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next.next = new ListNode(3);

		head = deleteGreaterOnRight(head);
		print(head);
	}
}