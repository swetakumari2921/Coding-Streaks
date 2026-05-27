package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode21 {
	int data;
	ListNode21 next;

	ListNode21(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex150 {

	static ListNode21 rotateAntiClockwise(ListNode21 head, int k) {

		if (head == null || k == 0) {
			return head;
		}

		ListNode21 temp = head;
		int count = 1;

		while (temp.next != null) {
			temp = temp.next;
			count++;
		}

		k = k % count;

		if (k == 0) {
			return head;
		}

		temp.next = head;

		ListNode21 current = head;

		for (int i = 1; i < k; i++) {
			current = current.next;
		}

		ListNode21 newHead = current.next;
		current.next = null;

		return newHead;
	}

	static void display(ListNode21 head) {

		ListNode21 temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ListNode21 head = null;
		ListNode21 tail = null;

		for (int i = 0; i < n; i++) {

			int value = sc.nextInt();

			ListNode21 newNode = new ListNode21(value);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		int k = sc.nextInt();

		head = rotateAntiClockwise(head, k);

		display(head);
	}
}
