package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode28 {
	int data;
	ListNode28 next;

	ListNode28(int data) {
		this.data = data;
	}
}

public class Ex158 {

	static ListNode28 removeOddIndices(ListNode28 head) {

		if (head == null) {
			return null;
		}

		ListNode28 curr = head;

		while (curr != null && curr.next != null) {
			curr.next = curr.next.next;
			curr = curr.next;
		}

		return head;
	}

	static void display(ListNode28 head) {
		ListNode28 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		ListNode28 head = null;
		ListNode28 tail = null;

		System.out.println("Enter node values:");

		for (int i = 0; i < n; i++) {

			ListNode28 newNode = new ListNode28(sc.nextInt());

			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		head = removeOddIndices(head);

		System.out.println("Linked List after removing odd index nodes:");
		display(head);
	}
}
