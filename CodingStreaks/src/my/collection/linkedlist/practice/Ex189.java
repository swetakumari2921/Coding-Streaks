package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode53 {
	int data;
	ListNode53 next;

	ListNode53(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex189 {

	static boolean detectCycle(ListNode53 head) {
		ListNode53 slow = head;
		ListNode53 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	static void display(ListNode53 head, int limit) {
		ListNode53 temp = head;
		int count = 0;

		while (temp != null && count < limit) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			count++;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Empty Linked List");
			return;
		}

		System.out.print("Enter first node: ");
		ListNode53 head = new ListNode53(sc.nextInt());
		ListNode53 temp = head;

		ListNode53[] nodes = new ListNode53[n];
		nodes[0] = head;

		for (int i = 1; i < n; i++) {
			System.out.print("Enter node: ");
			temp.next = new ListNode53(sc.nextInt());
			temp = temp.next;
			nodes[i] = temp;
		}

		System.out.print("Enter index to create cycle (-1 for no cycle): ");
		int index = sc.nextInt();

		if (index >= 0 && index < n) {
			temp.next = nodes[index];
		}

		if (index == -1) {
			System.out.print("Linked List: ");
			display(head, n);
		}

		if (detectCycle(head))
			System.out.println("Cycle Detected");
		else
			System.out.println("No Cycle");
	}
}
