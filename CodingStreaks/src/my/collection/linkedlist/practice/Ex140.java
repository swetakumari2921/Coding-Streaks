package my.collection.linkedlist.practice;

class ListNode12 {
	int data;
	ListNode12 next;

	ListNode12(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex140 {

	public static void printAlternate(ListNode12 head) {

		ListNode12 temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");

			// move two steps
			if (temp.next != null) {
				temp = temp.next.next;
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) {

		ListNode12 head = new ListNode12(10);
		head.next = new ListNode12(20);
		head.next.next = new ListNode12(30);
		head.next.next.next = new ListNode12(40);
		head.next.next.next.next = new ListNode12(50);

		System.out.println("Alternate nodes:");
		printAlternate(head);
	}
}
