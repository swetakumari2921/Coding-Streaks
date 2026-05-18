package my.collection.linkedlist.practice;

class ListNode13 {
	int data;
	ListNode13 next;

	ListNode13(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex141 {

	public static ListNode13 deleteAlternate(ListNode13 head) {

		ListNode13 current = head;

		while (current != null && current.next != null) {

			// skip next node (delete it)
			current.next = current.next.next;

			// move to next valid node
			current = current.next;
		}

		return head;
	}

	public static void printList(ListNode13 head) {

		ListNode13 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		ListNode13 head = new ListNode13(1);
		head.next = new ListNode13(2);
		head.next.next = new ListNode13(3);
		head.next.next.next = new ListNode13(4);
		head.next.next.next.next = new ListNode13(5);
		head.next.next.next.next.next = new ListNode13(6);

		deleteAlternate(head);

		printList(head);
	}
}
