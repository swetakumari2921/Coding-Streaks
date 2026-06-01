package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode26 {
	int data;
	ListNode26 next;

	ListNode26(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex155 {

	static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	static ListNode26 keepPrimeNodes(ListNode26 head) {

		// remove leading non-prime nodes
		while (head != null && !isPrime(head.data)) {
			head = head.next;
		}

		ListNode26 curr = head;

		while (curr != null && curr.next != null) {

			if (!isPrime(curr.next.data)) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return head;
	}

	static void print(ListNode26 head) {
		ListNode26 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		ListNode26 head = null, tail = null;

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			ListNode26 node = new ListNode26(sc.nextInt());

			if (head == null) {
				head = tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
		}

		head = keepPrimeNodes(head);

		System.out.println("After keeping only primes:");
		print(head);
	}
}
