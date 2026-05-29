package my.collection.linkedlist.practice;

import java.util.Scanner;

class ListNode23 {

	int data;
	ListNode23 next;

	ListNode23(int data) {
		this.data = data;
	}
}

public class Ex152 {

	static ListNode23 insert(ListNode23 head, int data) {

		ListNode23 newNode = new ListNode23(data);

		if (head == null) {
			return newNode;
		}

		ListNode23 temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;

		return head;
	}

	static void findNode(ListNode23 head, int i, int j) {

		int position = i * j;

		int index = 1;

		ListNode23 temp = head;

		while (temp != null) {

			if (index == position) {
				System.out.println("Node at position " + position + " is: " + temp.data);
				return;
			}

			temp = temp.next;
			index++;
		}

		System.out.println("Position not found");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ListNode23 head = null;

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		System.out.println("Enter node values:");

		for (int i = 0; i < n; i++) {
			head = insert(head, sc.nextInt());
		}

		System.out.println("Enter i:");
		int i = sc.nextInt();

		System.out.println("Enter j:");
		int j = sc.nextInt();

		findNode(head, i, j);
	}
}
