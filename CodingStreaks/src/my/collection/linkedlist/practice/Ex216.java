package my.collection.linkedlist.practice;

class ListNode81 {
	int data;
	ListNode81 next;

	ListNode81(int data) {
		this.data = data;
	}
}

public class Ex216 {

	static int sumAtOddDistance(ListNode81 head) {
		int sum = 0;
		int distance = 0;
		ListNode81 current = head;

		while (current != null) {
			if (distance % 2 == 1) {
				sum += current.data;
			}
			current = current.next;
			distance++;
		}

		return sum;
	}

	static void printList(ListNode81 head) {
		ListNode81 current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode81 head = new ListNode81(10);
		head.next = new ListNode81(20);
		head.next.next = new ListNode81(30);
		head.next.next.next = new ListNode81(40);
		head.next.next.next.next = new ListNode81(50);

		System.out.println("Linked List:");
		printList(head);

		int sum = sumAtOddDistance(head);

		System.out.println("Sum of nodes at odd distance from head: " + sum);
	}
}
