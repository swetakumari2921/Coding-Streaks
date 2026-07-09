package my.collection.linkedlist.practice;

class ListNode57 {
	int data;
	ListNode57 next;

	ListNode57(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex193 {

	static ListNode57 reverseEvenNodes(ListNode57 head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode57 odd = head;
		ListNode57 evenHead = null;

		// Extract even positioned nodes and reverse them
		while (odd != null && odd.next != null) {

			ListNode57 even = odd.next;
			odd.next = even.next;

			even.next = evenHead;
			evenHead = even;

			odd = odd.next;
		}

		// Merge odd list with reversed even list
		odd = head;
		while (odd != null && evenHead != null) {

			ListNode57 temp1 = odd.next;
			ListNode57 temp2 = evenHead.next;

			odd.next = evenHead;
			evenHead.next = temp1;

			odd = temp1;
			evenHead = temp2;
		}

		return head;
	}

	static void display(ListNode57 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode57 head = new ListNode57(1);
		head.next = new ListNode57(2);
		head.next.next = new ListNode57(3);
		head.next.next.next = new ListNode57(4);
		head.next.next.next.next = new ListNode57(5);
		head.next.next.next.next.next = new ListNode57(6);

		System.out.print("Original List : ");
		display(head);

		head = reverseEvenNodes(head);

		System.out.print("Modified List : ");
		display(head);
	}
}
