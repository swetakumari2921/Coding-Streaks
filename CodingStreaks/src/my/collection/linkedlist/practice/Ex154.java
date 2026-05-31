package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode25 {
	int data;
	ListNode25 next;

	ListNode25(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex154 {

	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static ListNode25 removePrimeNodes(ListNode25 head) {

		while (head != null && isPrime(head.data)) {
			head = head.next;
		}

		ListNode25 current = head;

		while (current != null && current.next != null) {

			if (isPrime(current.next.data)) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}

	static void display(ListNode25 head) {

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		ListNode25 head = null;
		ListNode25 tail = null;

		System.out.println("Enter node values:");

		for (int i = 0; i < n; i++) {

			int value = sc.nextInt();

			ListNode25 newNode = new ListNode25(value);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		head = removePrimeNodes(head);

		System.out.println("Linked List after removing prime nodes:");
		display(head);

		sc.close();
	}
}
