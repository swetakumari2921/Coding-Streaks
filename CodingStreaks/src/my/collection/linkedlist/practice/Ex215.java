package my.collection.linkedlist.practice;

class ListNode80 {
	int data;
	ListNode80 next;

	ListNode80(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex215 {

	public static int sumEvenDistance(ListNode80 head) {
		int sum = 0;
		int distance = 0;

		ListNode80 current = head;

		while (current != null) {
			if (distance % 2 == 0) {
				sum += current.data;
			}
			current = current.next;
			distance++;
		}

		return sum;
	}

	public static void main(String[] args) {
		ListNode80 head = new ListNode80(10);
		head.next = new ListNode80(20);
		head.next.next = new ListNode80(30);
		head.next.next.next = new ListNode80(40);
		head.next.next.next.next = new ListNode80(50);

		System.out.println("Sum of nodes at even distance from head: " + sumEvenDistance(head));
	}
}
