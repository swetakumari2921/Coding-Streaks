package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode27 {
	int data;
	ListNode27 next;

	ListNode27(int data) {
		this.data = data;
	}
}

public class Ex156 {

	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	static ListNode27 removePrimeIndices(ListNode27 head) {

		if (head == null) {
			return null;
		}

		int index = 0;
		ListNode27 curr = head;
		ListNode27 prev = null;

		while (curr != null) {

			if (isPrime(index)) {
				prev.next = curr.next;
				curr = curr.next;
			} else {
				prev = curr;
				curr = curr.next;
			}

			index++;
		}

		return head;
	}

	static void display(ListNode27 head) {
		ListNode27 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		ListNode27 head = null;
		ListNode27 tail = null;

		System.out.println("Enter node values:");

		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();

			ListNode27 newNode = new ListNode27(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		head = removePrimeIndices(head);

		System.out.print("Linked List after removing prime index nodes: ");
		display(head);

		sc.close();
	}
}
