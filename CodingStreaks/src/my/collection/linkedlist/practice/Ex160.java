package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode30 {
	int data;
	ListNode30 next;

	ListNode30(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex160 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		if (n < 2) {
			System.out.println("At least 2 nodes required.");
			return;
		}

		ListNode30 head = null, tail = null;

		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();

			ListNode30 newNode = new ListNode30(val);

			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		int minDiff = Integer.MAX_VALUE;
		int node1 = 0, node2 = 0;

		ListNode30 temp = head;

		while (temp != null && temp.next != null) {

			int diff = Math.abs(temp.data - temp.next.data);

			if (diff < minDiff) {
				minDiff = diff;
				node1 = temp.data;
				node2 = temp.next.data;
			}

			temp = temp.next;
		}

		System.out.println("Minimum Difference = " + minDiff);
		System.out.println("Adjacent Nodes = " + node1 + " and " + node2);
	}
}
