package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode29 {
	int data;
	ListNode29 next;

	ListNode29(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex159 {

	static ListNode29 insert(ListNode29 head, int data) {
		ListNode29 newNode = new ListNode29(data);

		if (head == null) {
			return newNode;
		}

		ListNode29 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		return head;
	}

	static void findMaxDiff(ListNode29 head) {

		if (head == null || head.next == null) {
			System.out.println("At least two nodes required.");
			return;
		}

		int maxDiff = Math.abs(head.data - head.next.data);
		int first = head.data;
		int second = head.next.data;

		ListNode29 temp = head;

		while (temp.next != null) {

			int diff = Math.abs(temp.data - temp.next.data);

			if (diff > maxDiff) {
				maxDiff = diff;
				first = temp.data;
				second = temp.next.data;
			}

			temp = temp.next;
		}

		System.out.println("Maximum Adjacent Difference = " + maxDiff);
		System.out.println("Nodes = " + first + " and " + second);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		ListNode29 head = null;

		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {
			head = insert(head, sc.nextInt());
		}

		findMaxDiff(head);
	}
}
