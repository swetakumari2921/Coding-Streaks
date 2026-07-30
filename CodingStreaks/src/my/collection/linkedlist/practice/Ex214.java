package my.collection.linkedlist.practice;

class ListNode79 {
	int data;
	ListNode79 next;

	ListNode79(int data) {
		this.data = data;
	}
}

public class Ex214 {

	public static ListNode79 reverse(ListNode79 head) {
		if (head == null || head.next == head) {
			return head;
		}

		ListNode79 prev = null;
		ListNode79 current = head;
		ListNode79 next;

		do {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		} while (current != head);

		head.next = prev;
		head = prev;

		return head;
	}

	public static void display(ListNode79 head) {
		if (head == null) {
			return;
		}

		ListNode79 temp = head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);

		System.out.println();
	}

	public static void main(String[] args) {
		ListNode79 head = new ListNode79(1);
		ListNode79 second = new ListNode79(2);
		ListNode79 third = new ListNode79(3);
		ListNode79 fourth = new ListNode79(4);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = head;

		System.out.println("Original Circular Linked List:");
		display(head);

		head = reverse(head);

		System.out.println("Reversed Circular Linked List:");
		display(head);
	}
}
